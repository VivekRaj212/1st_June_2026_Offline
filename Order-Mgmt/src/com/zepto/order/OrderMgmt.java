package com.zepto.order;

import com.zepto.payment.PaymentService;

public class OrderMgmt {

	public static void main(String[] args) {
		OrderMgmt mgmt = new OrderMgmt();
		Order order = new Order();

		order.setOrderId(101L);
		order.setCustomerId(1001L);
		order.setOrderStatus("PLACED");
		order.setTotalAmount(450.50);
		order.setPaymentStatus("PENDING");
		order.setPaymentMethod("CARD");
		order.setDeliveryAddress("Bangalore, Karnataka");

		mgmt.placeOrder(order);
	}

	public void placeOrder(Order order) {

		// take the order

		// Order received
		System.out.println("Order Received");
		System.out.println("-------------------------");
		System.out.println("Order ID        : " + order.getOrderId());
		System.out.println("Customer ID     : " + order.getCustomerId());
		System.out.println("Order Status    : " + order.getOrderStatus());
		System.out.println("Total Amount    : " + order.getTotalAmount());
		System.out.println("Payment Status   : " + order.getPaymentStatus());
		System.out.println("Payment Method  : " + order.getPaymentMethod());
		System.out.println("Delivery Address: " + order.getDeliveryAddress());
		System.out.println("Order Date      : " + order.getOrderDate());

		System.out.println("Order received successfully!");

		// confirm the payment

		PaymentService paymentService = new PaymentService();
		
		boolean paymentStatus = paymentService.confirmPayment("1234098712340987", "12/01", "087");
		
		if (paymentStatus) 
		{
			System.out.println("Payment is successful.");
		} else
		{
			System.out.println("Payment failed.");
		}
		
		paymentService.checkStatus("TXN1234");
	}

}
