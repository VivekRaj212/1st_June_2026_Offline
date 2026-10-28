package finance.oneloan.test;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Order Management System with a simple Standard Operating Procedure (SOP).
 *
 * SOP: 1. Receive and validate an order. 2. Check stock and reserve products.
 * 3. Calculate subtotal, tax, and total. 4. Process payment. 5. Confirm, pack,
 * ship, and deliver the order. 6. Cancel failed orders and restore stock. 7.
 * Print order and inventory reports.
 *
 * Demo only: all data is in memory and payment is simulated.
 */
public class OrderManagementSOP {

	private static final Logger logger = LogManager.getLogger(OrderManagementSOP.class);

	private static final double TAX_RATE = 0.18;
	private static final Map<String, Product> inventory = new LinkedHashMap<>();
	private static int nextOrderId = 1001;

	public static void main(String[] args) {
		printHeader();
		loadInventory();
		printSOP();

		Order first = createOrder("C101", "Asha Sharma", "asha@example.com", "P101", 2);
		if (first != null) {
			processPayment(first, true);
			confirmOrder(first);
			packOrder(first);
			shipOrder(first);
			deliverOrder(first);
		}

		Order second = createOrder("C102", "Ravi Kumar", "ravi@example.com", "P102", 1);
		if (second != null) {
			processPayment(second, false);
			cancelOrder(second, "Payment failed");
		}

		createOrder("C103", "Meena Rao", "meena@example.com", "P103", 50);
		printInventory();
		printOrder(first);
		printOrder(second);
		printFooter();
	}

	private static void printHeader() {
		logger.trace("========================================");
		logger.trace("       ORDER MANAGEMENT SYSTEM");
		logger.trace("========================================");
		logger.info("Module: Order Processing");
		logger.debug("Mode: Console demonstration");
		logger.warn("Starting workflow...");
		logger.error("this is error");
	}

	private static void loadInventory() {
		logger.info("SOP STEP 0: LOAD INVENTORY");
		inventory.put("P101", new Product("P101", "Keyboard", 1200.00, 10));
		inventory.put("P102", new Product("P102", "Mouse", 600.00, 5));
		inventory.put("P103", new Product("P103", "Monitor", 9500.00, 3));
		logger.info("Products loaded: " + inventory.size());
		logger.info("Inventory is ready.");
		logger.info("");
	}

	private static void printSOP() {
		logger.info("STANDARD OPERATING PROCEDURE (SOP)");
		logger.info("1. Receive order details.");
		logger.info("2. Validate customer, product, and quantity.");
		logger.info("3. Check and reserve available stock.");
		logger.info("4. Calculate subtotal, tax, and final amount.");
		logger.info("5. Process payment.");
		logger.info("6. Confirm the order after successful payment.");
		logger.info("7. Pack the confirmed order.");
		logger.info("8. Ship the packed order.");
		logger.info("9. Mark the shipment as delivered.");
		logger.info("10. Cancel eligible orders and restore stock.");
		logger.info("11. Print order and inventory reports.");
		logger.info("");
	}

	private static Order createOrder(String customerId, String customerName, String email, String productId,
			int quantity) {

		logger.info("----------------------------------------");
		logger.info("SOP STEP 1: RECEIVE ORDER");
		logger.info("Customer ID: " + customerId);
		logger.info("Customer name: " + customerName);
		logger.info("Email: " + email);
		logger.info("Product ID: " + productId);
		logger.info("Quantity requested: " + quantity);

		if (!validCustomer(customerId, customerName, email)) {
			logger.warn("Rejected: invalid customer details.");
			return null;
		}
		if (quantity <= 0) {
			logger.warn("Rejected: quantity must be positive.");
			return null;
		}

		logger.info("SOP STEP 2: VALIDATE PRODUCT AND STOCK");
		Product product = inventory.get(productId);
		if (product == null) {
			logger.warn("Rejected: product not found.");
			return null;
		}

		logger.info("Product name: " + product.name);
		logger.info("Unit price: " + money(product.price));
		logger.info("Available stock: " + product.stock);
		if (product.stock < quantity) {
			logger.warn("Rejected: insufficient stock.");
			logger.debug("No order has been created.");
			return null;
		}

		product.stock -= quantity;
		logger.info("SOP STEP 3: STOCK RESERVED");
		logger.info("Remaining stock: " + product.stock);

		double subtotal = product.price * quantity;
		double tax = subtotal * TAX_RATE;
		double total = subtotal + tax;
		logger.info("SOP STEP 4: CALCULATE TOTAL");
		logger.info("Subtotal: " + money(subtotal));
		logger.info("Tax at 18%: " + money(tax));
		logger.info("Order total: " + money(total));

		Order order = new Order(nextOrderId++, customerId, customerName, email, product, quantity, subtotal, tax,
				total);
		order.status = "PENDING_PAYMENT";
		logger.info("Order created with ID: " + order.id);
		logger.info("Status: " + order.status);
		logger.info("");
		return order;
	}

	private static boolean validCustomer(String id, String name, String email) {
		boolean valid = id != null && !id.trim().isEmpty() && name != null && !name.trim().isEmpty() && email != null
				&& email.contains("@");
		logger.info("Customer validation result: " + valid);
		return valid;
	}

	private static void processPayment(Order order, boolean successful) {
		logger.info("SOP STEP 5: PROCESS PAYMENT");
		logger.info("Order ID: " + order.id);
		logger.info("Amount due: " + money(order.total));

		if (successful) {
			order.paymentStatus = "PAID";
			logger.info("Payment accepted (simulated).");
		} else {
			order.paymentStatus = "FAILED";
			logger.warn("Payment failed (simulated).");
		}
		logger.info("Payment status: " + order.paymentStatus);
		logger.info("");
	}

	private static void confirmOrder(Order order) {
		logger.info("SOP STEP 6: CONFIRM ORDER");
		if (!"PAID".equals(order.paymentStatus)) {
			logger.warn("Cannot confirm an unpaid order.");
			return;
		}
		order.status = "CONFIRMED";
		logger.info("Order confirmed: " + order.id);
		logger.info("Status: " + order.status);
		logger.info("");
	}

	private static void packOrder(Order order) {
		logger.info("SOP STEP 7: PACK ORDER");
		if (!"CONFIRMED".equals(order.status)) {
			logger.error("Packing skipped because order is not confirmed.");
			return;
		}
		order.status = "PACKED";
		logger.info("Product packed: " + order.product.name);
		logger.info("Quantity packed: " + order.quantity);
		logger.info("Status: " + order.status);
		logger.info("");
	}

	private static void shipOrder(Order order) {
		logger.info("SOP STEP 8: SHIP ORDER");
		if (!"PACKED".equals(order.status)) {
			logger.warn("Shipping skipped because order is not packed.");
			return;
		}
		order.trackingNumber = "TRK-" + order.id;
		order.status = "SHIPPED";
		logger.info("Shipment created.");
		logger.info("Tracking number: " + order.trackingNumber);
		logger.info("Status: " + order.status);
		logger.info("");
	}

	private static void deliverOrder(Order order) {
		logger.info("SOP STEP 9: DELIVER ORDER");
		if (!"SHIPPED".equals(order.status)) {
			logger.warn("Delivery skipped because order is not shipped.");
			return;
		}
		order.status = "DELIVERED";
		logger.info("Delivery confirmed for customer: " + order.customerName);
		logger.info("Order ID: " + order.id);
		logger.info("Final status: " + order.status);
		logger.info("");
	}

	private static void cancelOrder(Order order, String reason) {
		logger.info("SOP STEP 10: CANCEL ORDER");
		if ("DELIVERED".equals(order.status) || "CANCELLED".equals(order.status)) {
			logger.warn("Cancellation not allowed for status " + order.status);
			return;
		}

		order.product.stock += order.quantity;
		order.status = "CANCELLED";
		order.cancellationReason = reason;
		logger.info("Order cancelled: " + order.id);
		logger.info("Reason: " + reason);
		logger.info("Reserved stock restored.");
		logger.info("Payment status: " + order.paymentStatus);
		logger.info("A real system would check whether a refund is required.");
		logger.info("");
	}

	private static void printInventory() {
		logger.info("SOP STEP 11: INVENTORY REPORT");
		for (Product product : inventory.values()) {
			logger.info("Product ID: " + product.id);
			logger.info("Product name: " + product.name);
			logger.info("Unit price: " + money(product.price));
			logger.info("Stock available: " + product.stock);
			logger.info("----------------------------------------");
		}
	}

	private static void printOrder(Order order) {
		logger.info("=============== ORDER REPORT ===============");
		if (order == null) {
			logger.warn("No order record was created.");
			return;
		}
		logger.info("Order ID: " + order.id);
		logger.info("Customer ID: " + order.customerId);
		logger.info("Customer name: " + order.customerName);
		logger.info("Email: " + order.email);
		logger.info("Product: " + order.product.name);
		logger.info("Quantity: " + order.quantity);
		logger.info("Subtotal: " + money(order.subtotal));
		logger.info("Tax: " + money(order.tax));
		logger.info("Total: " + money(order.total));
		logger.info("Payment status: " + order.paymentStatus);
		logger.info("Order status: " + order.status);
		logger.info("Tracking number: " + order.trackingNumber);
		logger.info("Cancellation reason: " + order.cancellationReason);
		logger.info("============================================");
	}

	private static String money(double amount) {
		return String.format("INR %.2f", amount);
	}

	private static void printFooter() {
		logger.info("");
		logger.info("========================================");
		logger.info("       WORKFLOW COMPLETED");
		logger.info("========================================");
		logger.info("Review the status changes in the output.");
		logger.info("Notice stock reservation and restoration.");
		logger.info("Payment and shipping are simulated.");
		logger.info("Production systems require a database,");
		logger.info("transaction safety, security, audit logs,");
		logger.info("and a real payment/refund integration.");
		logger.info("End of Order Management System.");
	}

	private static class Product {
		private final String id;
		private final String name;
		private final double price;
		private int stock;

		private Product(String id, String name, double price, int stock) {
			this.id = id;
			this.name = name;
			this.price = price;
			this.stock = stock;
		}
	}

	private static class Order {
		private final int id;
		private final String customerId;
		private final String customerName;
		private final String email;
		private final Product product;
		private final int quantity;
		private final double subtotal;
		private final double tax;
		private final double total;
		private String status;
		private String paymentStatus = "NOT_PROCESSED";
		private String trackingNumber = "NOT_ASSIGNED";
		private String cancellationReason = "N/A";

		private Order(int id, String customerId, String customerName, String email, Product product, int quantity,
				double subtotal, double tax, double total) {
			this.id = id;
			this.customerId = customerId;
			this.customerName = customerName;
			this.email = email;
			this.product = product;
			this.quantity = quantity;
			this.subtotal = subtotal;
			this.tax = tax;
			this.total = total;
		}
	}
}
