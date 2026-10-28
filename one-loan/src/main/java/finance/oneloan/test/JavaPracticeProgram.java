package finance.oneloan.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A large single-class Java program for practicing Java fundamentals.
 *
 * Topics demonstrated:
 * - System.out.println() and formatted output
 * - Variables and primitive data types
 * - Operators and conditional statements
 * - Loops
 * - Methods and method overloading
 * - Arrays and Strings
 * - Collections: List, Set, and Map
 * - Exception handling
 * - Basic object-independent utility methods
 * - Date and time
 *
 * Run this class directly from your IDE.
 *
 * @author Suresh
 */
public class JavaPracticeProgram {

    private static final String APPLICATION_NAME = "Java Practice Console";
    private static final String VERSION = "1.0";
    private static final int MAX_SCORE = 100;
    private static final int PASS_MARK = 40;

    public static void main(String[] args) {
        printApplicationHeader();
        printWelcomeMessage();
        demonstrateVariables();
        demonstrateArithmeticOperators();
        demonstrateComparisonOperators();
        demonstrateLogicalOperators();
        demonstrateConditionalStatements();
        demonstrateSwitchStatement();
        demonstrateForLoop();
        demonstrateWhileLoop();
        demonstrateDoWhileLoop();
        demonstrateBreakAndContinue();
        demonstrateNestedLoops();
        demonstrateMethods();
        demonstrateMethodOverloading();
        demonstrateArrays();
        demonstrateTwoDimensionalArray();
        demonstrateStringOperations();
        demonstrateStringBuilder();
        demonstrateListOperations();
        demonstrateSetOperations();
        demonstrateMapOperations();
        demonstrateEnhancedForLoop();
        demonstrateSorting();
        demonstrateSearching();
        demonstrateBasicStatistics();
        demonstratePrimeNumbers();
        demonstrateFactorial();
        demonstrateFibonacci();
        demonstratePalindrome();
        demonstrateExceptionHandling();
        demonstrateDateAndTime();
        demonstrateRandomNumbers();
        demonstrateValidation();
        demonstrateMenuSimulation();
        demonstrateStudentScoreReport();
        demonstrateSummary();
        printApplicationFooter();
    }

    private static void printApplicationHeader() {
        System.out.println("==================================================");
        System.out.println("              APPLICATION STARTED");
        System.out.println("==================================================");
        System.out.println("Application Name : " + APPLICATION_NAME);
        System.out.println("Application Version : " + VERSION);
        System.out.println("Java program execution has started.");
        System.out.println("Preparing demonstration modules.");
        System.out.println("Loading constants and configuration.");
        System.out.println("Initializing the console application.");
        System.out.println("Header printed successfully.");
        System.out.println("==================================================");
    }

    private static void printWelcomeMessage() {
        System.out.println();
        System.out.println("Welcome to the Java Practice Program.");
        System.out.println("This program contains many Java examples.");
        System.out.println("Every section prints information to the console.");
        System.out.println("Read the output carefully while practicing.");
        System.out.println("You can set breakpoints in each method.");
        System.out.println("You can step through the program in Eclipse.");
        System.out.println("You can modify values and observe the output.");
        System.out.println("You can add more methods for additional practice.");
        System.out.println("Let's begin the Java demonstrations.");
        System.out.println();
    }

    private static void demonstrateVariables() {
        System.out.println("--------------- VARIABLES ---------------");
        byte age = 25;
        short year = 2026;
        int studentCount = 120;
        long population = 1_400_000_000L;
        float percentage = 87.5f;
        double salary = 75000.50;
        char grade = 'A';
        boolean isActive = true;
        String studentName = "Rahul";

        System.out.println("Student name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Student count: " + studentCount);
        System.out.println("Population: " + population);
        System.out.println("Percentage: " + percentage);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Active status: " + isActive);
        System.out.println("Integer plus five: " + (studentCount + 5));
        System.out.println("Age after one year: " + (age + 1));
        System.out.println("Variables demonstration completed.");
        System.out.println();
    }

    private static void demonstrateArithmeticOperators() {
        System.out.println("--------------- ARITHMETIC OPERATORS ---------------");
        int first = 25;
        int second = 4;

        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
        System.out.println("Addition: " + (first + second));
        System.out.println("Subtraction: " + (first - second));
        System.out.println("Multiplication: " + (first * second));
        System.out.println("Integer division: " + (first / second));
        System.out.println("Remainder: " + (first % second));
        System.out.println("Decimal division: " + ((double) first / second));

        int counter = 10;
        System.out.println("Initial counter: " + counter);
        counter++;
        System.out.println("After increment: " + counter);
        counter--;
        System.out.println("After decrement: " + counter);
        counter += 5;
        System.out.println("After adding five: " + counter);
        counter *= 2;
        System.out.println("After multiplying by two: " + counter);
        System.out.println("Arithmetic demonstration completed.");
        System.out.println();
    }

    private static void demonstrateComparisonOperators() {
        System.out.println("--------------- COMPARISON OPERATORS ---------------");
        int a = 10;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("Is a positive: " + (a > 0));
        System.out.println("Is b even: " + (b % 2 == 0));
        System.out.println("Is a odd: " + (a % 2 != 0));
        System.out.println("Comparison demonstration completed.");
        System.out.println();
    }

    private static void demonstrateLogicalOperators() {
        System.out.println("--------------- LOGICAL OPERATORS ---------------");
        int age = 24;
        boolean hasDegree = true;
        boolean hasExperience = false;
        boolean isEligibleByAge = age >= 18;

        System.out.println("Age: " + age);
        System.out.println("Has degree: " + hasDegree);
        System.out.println("Has experience: " + hasExperience);
        System.out.println("Eligible by age: " + isEligibleByAge);
        System.out.println("Age and degree: " + (isEligibleByAge && hasDegree));
        System.out.println("Age or experience: " + (isEligibleByAge || hasExperience));
        System.out.println("Not has degree: " + (!hasDegree));
        System.out.println("Both conditions false: " + (!hasDegree && !hasExperience));
        System.out.println("Logical demonstration completed.");
        System.out.println();
    }

    private static void demonstrateConditionalStatements() {
        System.out.println("--------------- IF ELSE ---------------");
        int score = 76;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 60) {
            System.out.println("Grade: C");
        } else if (score >= PASS_MARK) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        System.out.println("Score evaluated: " + score);
        System.out.println("Maximum possible score: " + MAX_SCORE);
        System.out.println("Pass mark: " + PASS_MARK);
        System.out.println("Is score valid: " + (score >= 0 && score <= MAX_SCORE));
        System.out.println("Conditional demonstration completed.");
        System.out.println();
    }

    private static void demonstrateSwitchStatement() {
        System.out.println("--------------- SWITCH STATEMENT ---------------");
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day number: " + day);
        System.out.println("Day name: " + dayName);
        System.out.println("Weekend check: " + (day == 6 || day == 7));
        System.out.println("Switch demonstration completed.");
        System.out.println();
    }

    private static void demonstrateForLoop() {
        System.out.println("--------------- FOR LOOP ---------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Loop iteration: " + i);
        }

        System.out.println("Counting backward.");
        for (int i = 5; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("Current number: " + i + ", running sum: " + sum);
        }

        System.out.println("Final sum from one to ten: " + sum);
        System.out.println("For loop demonstration completed.");
        System.out.println();
    }

    private static void demonstrateWhileLoop() {
        System.out.println("--------------- WHILE LOOP ---------------");
        int count = 1;

        while (count <= 5) {
            System.out.println("While loop count: " + count);
            count++;
        }

        System.out.println("Count after loop: " + count);
        int number = 16;

        while (number > 0) {
            System.out.println("Current number: " + number);
            number /= 2;
        }

        System.out.println("Number after repeated division: " + number);
        System.out.println("While loop demonstration completed.");
        System.out.println();
    }

    private static void demonstrateDoWhileLoop() {
        System.out.println("--------------- DO WHILE LOOP ---------------");
        int count = 1;

        do {
            System.out.println("Do-while iteration: " + count);
            count++;
        } while (count <= 5);

        System.out.println("Do-while final count: " + count);
        int zeroCount = 0;

        do {
            System.out.println("This block executes at least once.");
            zeroCount++;
        } while (zeroCount < 0);

        System.out.println("Zero-count value: " + zeroCount);
        System.out.println("Do-while demonstration completed.");
        System.out.println();
    }

    private static void demonstrateBreakAndContinue() {
        System.out.println("--------------- BREAK AND CONTINUE ---------------");
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                System.out.println("Skipping number four.");
                continue;
            }

            if (i == 8) {
                System.out.println("Stopping at number eight.");
                break;
            }

            System.out.println("Current value: " + i);
        }

        System.out.println("Break and continue demonstration completed.");
        System.out.println();
    }

    private static void demonstrateNestedLoops() {
        System.out.println("--------------- NESTED LOOPS ---------------");
        for (int row = 1; row <= 4; row++) {
            for (int column = 1; column <= 3; column++) {
                System.out.println("Row: " + row + ", Column: " + column);
            }
        }

        System.out.println("Printing a small number pattern.");
        for (int row = 1; row <= 5; row++) {
            StringBuilder line = new StringBuilder();
            for (int column = 1; column <= row; column++) {
                line.append(column).append(' ');
            }
            System.out.println(line);
        }

        System.out.println("Nested loop demonstration completed.");
        System.out.println();
    }

    private static void demonstrateMethods() {
        System.out.println("--------------- METHODS ---------------");
        greetUser();
        greetPerson("Asha");
        greetPerson("Ravi");
        int result = addNumbers(15, 25);
        System.out.println("Addition method result: " + result);
        System.out.println("Maximum number: " + findMaximum(45, 89));
        System.out.println("Minimum number: " + findMinimum(45, 89));
        System.out.println("Square of seven: " + square(7));
        System.out.println("Is ten even: " + isEven(10));
        System.out.println("Is eleven even: " + isEven(11));
        System.out.println("Methods demonstration completed.");
        System.out.println();
    }

    private static void greetUser() {
        System.out.println("Hello from the greetUser method.");
        System.out.println("Methods help us reuse code.");
        System.out.println("This method does not return a value.");
    }

    private static void greetPerson(String name) {
        System.out.println("Hello, " + name + ".");
        System.out.println("Welcome to the Java program, " + name + ".");
    }

    private static int addNumbers(int first, int second) {
        System.out.println("Adding " + first + " and " + second + ".");
        return first + second;
    }

    private static int findMaximum(int first, int second) {
        System.out.println("Finding maximum of two numbers.");
        return first > second ? first : second;
    }

    private static int findMinimum(int first, int second) {
        System.out.println("Finding minimum of two numbers.");
        return first < second ? first : second;
    }

    private static int square(int number) {
        System.out.println("Calculating square for " + number + ".");
        return number * number;
    }

    private static boolean isEven(int number) {
        System.out.println("Checking whether " + number + " is even.");
        return number % 2 == 0;
    }

    private static void demonstrateMethodOverloading() {
        System.out.println("--------------- METHOD OVERLOADING ---------------");
        System.out.println("Integer addition: " + add(10, 20));
        System.out.println("Double addition: " + add(10.5, 20.7));
        System.out.println("Three-number addition: " + add(10, 20, 30));
        System.out.println("String joining: " + add("Java ", "Programming"));
        System.out.println("Overloading uses the same method name with different parameters.");
        System.out.println("Method overloading demonstration completed.");
        System.out.println();
    }

    private static int add(int first, int second) {
        System.out.println("Called integer add method.");
        return first + second;
    }

    private static double add(double first, double second) {
        System.out.println("Called double add method.");
        return first + second;
    }

    private static int add(int first, int second, int third) {
        System.out.println("Called three-argument add method.");
        return first + second + third;
    }

    private static String add(String first, String second) {
        System.out.println("Called string add method.");
        return first + second;
    }

    private static void demonstrateArrays() {
        System.out.println("--------------- ARRAYS ---------------");
        int[] numbers = {12, 5, 28, 9, 17, 4};
        System.out.println("Array length: " + numbers.length);
        System.out.println("Array contents: " + Arrays.toString(numbers));

        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Index " + index + " contains " + numbers[index]);
        }

        int total = 0;
        for (int number : numbers) {
            total += number;
            System.out.println("Adding array value: " + number);
        }

        System.out.println("Array total: " + total);
        System.out.println("Array average: " + ((double) total / numbers.length));
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        numbers[0] = 100;
        System.out.println("Updated array: " + Arrays.toString(numbers));
        System.out.println("Arrays demonstration completed.");
        System.out.println();
    }

    private static void demonstrateTwoDimensionalArray() {
        System.out.println("--------------- TWO-DIMENSIONAL ARRAY ---------------");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println("Value at [" + row + "][" + column + "] = "
                        + matrix[row][column]);
            }
        }

        System.out.println("Matrix row count: " + matrix.length);
        System.out.println("First row column count: " + matrix[0].length);
        int diagonalSum = 0;

        for (int index = 0; index < matrix.length; index++) {
            diagonalSum += matrix[index][index];
            System.out.println("Diagonal value: " + matrix[index][index]);
        }

        System.out.println("Diagonal sum: " + diagonalSum);
        System.out.println("Two-dimensional array demonstration completed.");
        System.out.println();
    }

    private static void demonstrateStringOperations() {
        System.out.println("--------------- STRING OPERATIONS ---------------");
        String text = "Java Backend Development";
        String name = "  tapqwik academy  ";

        System.out.println("Original text: " + text);
        System.out.println("Text length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Character at index zero: " + text.charAt(0));
        System.out.println("Contains Java: " + text.contains("Java"));
        System.out.println("Starts with Java: " + text.startsWith("Java"));
        System.out.println("Ends with Development: " + text.endsWith("Development"));
        System.out.println("Substring: " + text.substring(5));
        System.out.println("Replace spaces: " + text.replace(" ", "-"));
        System.out.println("Trimmed name: " + name.trim());
        System.out.println("Equals check: " + "java".equals("Java"));
        System.out.println("Ignore-case check: " + "java".equalsIgnoreCase("Java"));
        System.out.println("Split words: " + Arrays.toString(text.split(" ")));
        System.out.println("String operations demonstration completed.");
        System.out.println();
    }

    private static void demonstrateStringBuilder() {
        System.out.println("--------------- STRING BUILDER ---------------");
        StringBuilder builder = new StringBuilder();
        builder.append("Java");
        System.out.println("After first append: " + builder);
        builder.append(" ");
        System.out.println("After adding a space: " + builder);
        builder.append("Backend");
        System.out.println("After second word: " + builder);
        builder.append(" Programming");
        System.out.println("Complete text: " + builder);
        builder.insert(5, "Core ");
        System.out.println("After insert: " + builder);
        builder.replace(0, 4, "Advanced");
        System.out.println("After replace: " + builder);
        builder.reverse();
        System.out.println("After reverse: " + builder);
        builder.reverse();
        System.out.println("Restored text: " + builder);
        System.out.println("StringBuilder demonstration completed.");
        System.out.println();
    }

    private static void demonstrateListOperations() {
        System.out.println("--------------- LIST OPERATIONS ---------------");
        List<String> students = new ArrayList<>();
        students.add("Asha");
        students.add("Ravi");
        students.add("Kiran");
        students.add("Meena");
        students.add("Arjun");

        System.out.println("Initial students: " + students);
        System.out.println("Student count: " + students.size());
        System.out.println("Student at index one: " + students.get(1));
        students.set(1, "Ravi Kumar");
        System.out.println("After updating student: " + students);
        students.add("Priya");
        System.out.println("After adding another student: " + students);
        students.remove("Kiran");
        System.out.println("After removing Kiran: " + students);
        System.out.println("Contains Meena: " + students.contains("Meena"));
        System.out.println("Is list empty: " + students.isEmpty());

        for (String student : students) {
            System.out.println("Student name: " + student);
        }

        students.clear();
        System.out.println("List after clear: " + students);
        System.out.println("List operations demonstration completed.");
        System.out.println();
    }

    private static void demonstrateSetOperations() {
        System.out.println("--------------- SET OPERATIONS ---------------");
        Set<String> cities = new HashSet<>();
        cities.add("Bengaluru");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Bengaluru");

        System.out.println("Cities set: " + cities);
        System.out.println("Set size: " + cities.size());
        System.out.println("Contains Mumbai: " + cities.contains("Mumbai"));
        System.out.println("Duplicate city is stored only once.");
        cities.remove("Delhi");
        System.out.println("After removing Delhi: " + cities);

        for (String city : cities) {
            System.out.println("City: " + city);
        }

        System.out.println("Set operations demonstration completed.");
        System.out.println();
    }

    private static void demonstrateMapOperations() {
        System.out.println("--------------- MAP OPERATIONS ---------------");
        Map<Integer, String> students = new LinkedHashMap<>();
        students.put(101, "Asha");
        students.put(102, "Ravi");
        students.put(103, "Meena");
        students.put(104, "Arjun");

        System.out.println("Student map: " + students);
        System.out.println("Map size: " + students.size());
        System.out.println("Student with ID 102: " + students.get(102));
        System.out.println("Has ID 105: " + students.containsKey(105));
        System.out.println("Has name Asha: " + students.containsValue("Asha"));
        students.put(102, "Ravi Kumar");
        System.out.println("After updating ID 102: " + students);
        students.put(105, "Priya");
        System.out.println("After adding ID 105: " + students);

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        students.remove(104);
        System.out.println("After removing ID 104: " + students);
        System.out.println("Map operations demonstration completed.");
        System.out.println();
    }

    private static void demonstrateEnhancedForLoop() {
        System.out.println("--------------- ENHANCED FOR LOOP ---------------");
        String[] technologies = {"Java", "Spring Boot", "SQL", "Kafka", "Redis"};

        for (String technology : technologies) {
            System.out.println("Technology: " + technology);
        }

        int[] marks = {65, 78, 91, 82, 74};
        int total = 0;

        for (int mark : marks) {
            total += mark;
            System.out.println("Mark: " + mark);
        }

        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + ((double) total / marks.length));
        System.out.println("Enhanced for loop demonstration completed.");
        System.out.println();
    }

    private static void demonstrateSorting() {
        System.out.println("--------------- SORTING ---------------");
        int[] values = {42, 7, 19, 3, 88, 21, 14};
        System.out.println("Before sorting: " + Arrays.toString(values));
        Arrays.sort(values);
        System.out.println("After sorting: " + Arrays.toString(values));
        System.out.println("Smallest value: " + values[0]);
        System.out.println("Largest value: " + values[values.length - 1]);

        String[] names = {"Ravi", "Asha", "Meena", "Arjun"};
        System.out.println("Names before sorting: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Names after sorting: " + Arrays.toString(names));
        System.out.println("Sorting demonstration completed.");
        System.out.println();
    }

    private static void demonstrateSearching() {
        System.out.println("--------------- SEARCHING ---------------");
        int[] values = {10, 20, 30, 40, 50, 60};
        int target = 40;
        int foundIndex = -1;

        for (int index = 0; index < values.length; index++) {
            System.out.println("Checking index " + index + ".");
            if (values[index] == target) {
                foundIndex = index;
                System.out.println("Target found.");
                break;
            }
        }

        System.out.println("Target value: " + target);
        System.out.println("Found index: " + foundIndex);
        System.out.println("Is target present: " + (foundIndex >= 0));
        System.out.println("Searching for 99 using Arrays.binarySearch.");
        System.out.println("Search result: " + Arrays.binarySearch(values, 99));
        System.out.println("Searching demonstration completed.");
        System.out.println();
    }

    private static void demonstrateBasicStatistics() {
        System.out.println("--------------- BASIC STATISTICS ---------------");
        int[] marks = {72, 85, 91, 64, 78, 88, 95, 69};
        int sum = 0;
        int highest = marks[0];
        int lowest = marks[0];

        for (int mark : marks) {
            sum += mark;
            if (mark > highest) {
                highest = mark;
            }
            if (mark < lowest) {
                lowest = mark;
            }
            System.out.println("Processed mark: " + mark);
        }

        double average = (double) sum / marks.length;
        System.out.println("Number of scores: " + marks.length);
        System.out.println("Total score: " + sum);
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Statistics demonstration completed.");
        System.out.println();
    }

    private static void demonstratePrimeNumbers() {
        System.out.println("--------------- PRIME NUMBERS ---------------");
        for (int number = 2; number <= 30; number++) {
            boolean prime = true;

            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        System.out.println("Prime number demonstration completed.");
        System.out.println();
    }

    private static void demonstrateFactorial() {
        System.out.println("--------------- FACTORIAL ---------------");
        for (int number = 0; number <= 10; number++) {
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is " + result);
        }

        System.out.println("Factorial of five: " + factorial(5));
        System.out.println("Factorial of seven: " + factorial(7));
        System.out.println("Factorial demonstration completed.");
        System.out.println();
    }

    private static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
            System.out.println("Factorial intermediate result for " + i + ": " + result);
        }
        return result;
    }

    private static void demonstrateFibonacci() {
        System.out.println("--------------- FIBONACCI SEQUENCE ---------------");
        int first = 0;
        int second = 1;

        for (int index = 1; index <= 12; index++) {
            System.out.println("Fibonacci position " + index + ": " + first);
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println("Fibonacci sequence demonstration completed.");
        System.out.println();
    }

    private static void demonstratePalindrome() {
        System.out.println("--------------- PALINDROME CHECK ---------------");
        String[] words = {"madam", "level", "java", "radar", "hello"};

        for (String word : words) {
            boolean palindrome = isPalindrome(word);
            System.out.println("Word: " + word + ", is palindrome: " + palindrome);
        }

        System.out.println("Number 121 palindrome: " + isPalindrome("121"));
        System.out.println("Number 123 palindrome: " + isPalindrome("123"));
        System.out.println("Palindrome demonstration completed.");
        System.out.println();
    }

    private static boolean isPalindrome(String value) {
        String normalized = value.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static void demonstrateExceptionHandling() {
        System.out.println("--------------- EXCEPTION HANDLING ---------------");
        try {
            int result = 100 / 5;
            System.out.println("Division result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Arithmetic error: " + exception.getMessage());
        }

        try {
            System.out.println("Attempting division by zero.");
            int result = 100 / 0;
            System.out.println("This line will not execute: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Caught exception: " + exception.getClass().getSimpleName());
            System.out.println("Exception message: " + exception.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }

        try {
            int[] values = {10, 20, 30};
            System.out.println("Accessing array element: " + values[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Caught invalid array index.");
            System.out.println("Exception type: " + exception.getClass().getName());
        }

        System.out.println("Program continues after exception handling.");
        System.out.println("Exception handling demonstration completed.");
        System.out.println();
    }

    private static void demonstrateDateAndTime() {
        System.out.println("--------------- DATE AND TIME ---------------");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Current date and time: " + now);
        System.out.println("Formatted date and time: " + now.format(formatter));
        System.out.println("Current year: " + now.getYear());
        System.out.println("Current month: " + now.getMonth());
        System.out.println("Current day of month: " + now.getDayOfMonth());
        System.out.println("Current hour: " + now.getHour());
        System.out.println("Current minute: " + now.getMinute());
        System.out.println("Current second: " + now.getSecond());
        System.out.println("Date and time demonstration completed.");
        System.out.println();
    }

    private static void demonstrateRandomNumbers() {
        System.out.println("--------------- RANDOM NUMBERS ---------------");
        Random random = new Random();

        for (int index = 1; index <= 10; index++) {
            int value = random.nextInt(100) + 1;
            System.out.println("Random value " + index + ": " + value);
        }

        System.out.println("Random number generation is complete.");
        System.out.println("Values can differ each time the program runs.");
        System.out.println();
    }

    private static void demonstrateValidation() {
        System.out.println("--------------- INPUT VALIDATION LOGIC ---------------");
        String[] emails = {
            "student@example.com",
            "invalid-email",
            "admin@tapqwik.com",
            "",
            "user.name@domain.in"
        };

        for (String email : emails) {
            System.out.println("Email: [" + email + "]");
            System.out.println("Email is valid: " + isValidEmail(email));
        }

        int[] ages = {17, 18, 21, 0, -5, 65};
        for (int age : ages) {
            System.out.println("Age " + age + " is valid: " + isValidAge(age));
        }

        System.out.println("Validation demonstration completed.");
        System.out.println();
    }

    private static boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');
        return atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1;
    }

    private static boolean isValidAge(int age) {
        return age >= 18 && age <= 120;
    }

    private static void demonstrateMenuSimulation() {
        System.out.println("--------------- MENU SIMULATION ---------------");
        String[] menuItems = {
            "1. View profile",
            "2. View courses",
            "3. View fees",
            "4. View attendance",
            "5. Exit"
        };

        for (String menuItem : menuItems) {
            System.out.println(menuItem);
        }

        int selectedOption = 3;
        System.out.println("Selected option: " + selectedOption);

        switch (selectedOption) {
            case 1:
                System.out.println("Opening profile.");
                break;
            case 2:
                System.out.println("Opening courses.");
                break;
            case 3:
                System.out.println("Opening fees.");
                break;
            case 4:
                System.out.println("Opening attendance.");
                break;
            case 5:
                System.out.println("Exiting application.");
                break;
            default:
                System.out.println("Invalid menu option.");
        }

        System.out.println("Menu simulation demonstration completed.");
        System.out.println();
    }

    private static void demonstrateStudentScoreReport() {
        System.out.println("--------------- STUDENT SCORE REPORT ---------------");
        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put("Asha", 91);
        scores.put("Ravi", 76);
        scores.put("Meena", 84);
        scores.put("Arjun", 38);
        scores.put("Priya", 67);

        int total = 0;
        int passed = 0;
        int failed = 0;

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();
            String status = score >= PASS_MARK ? "PASS" : "FAIL";

            if (score >= PASS_MARK) {
                passed++;
            } else {
                failed++;
            }

            total += score;
            System.out.println("----------------------------------------");
            System.out.println("Student name: " + student);
            System.out.println("Score: " + score);
            System.out.println("Status: " + status);
            System.out.println("Maximum score: " + MAX_SCORE);
            System.out.println("Percentage: " + score + "%");
        }

        System.out.println("----------------------------------------");
        System.out.println("Total students: " + scores.size());
        System.out.println("Passed students: " + passed);
        System.out.println("Failed students: " + failed);
        System.out.println("Combined score: " + total);
        System.out.println("Class average: " + ((double) total / scores.size()));
        System.out.println("Student score report completed.");
        System.out.println();
    }

    private static void demonstrateSummary() {
        System.out.println("--------------- PROGRAM SUMMARY ---------------");
        System.out.println("Variables were demonstrated.");
        System.out.println("Arithmetic operators were demonstrated.");
        System.out.println("Comparison operators were demonstrated.");
        System.out.println("Logical operators were demonstrated.");
        System.out.println("Conditional statements were demonstrated.");
        System.out.println("Switch statements were demonstrated.");
        System.out.println("For loops were demonstrated.");
        System.out.println("While loops were demonstrated.");
        System.out.println("Do-while loops were demonstrated.");
        System.out.println("Break and continue were demonstrated.");
        System.out.println("Nested loops were demonstrated.");
        System.out.println("Methods were demonstrated.");
        System.out.println("Method overloading was demonstrated.");
        System.out.println("Arrays were demonstrated.");
        System.out.println("Strings were demonstrated.");
        System.out.println("Collections were demonstrated.");
        System.out.println("Sorting and searching were demonstrated.");
        System.out.println("Basic algorithms were demonstrated.");
        System.out.println("Exception handling was demonstrated.");
        System.out.println("Date and time were demonstrated.");
        System.out.println("Validation logic was demonstrated.");
        System.out.println("Student reporting was demonstrated.");
        System.out.println("Review the output and practice modifying the code.");
        System.out.println("Add breakpoints to learn how execution moves between methods.");
        System.out.println("This program is a learning example, not a production application.");
        System.out.println();
    }

    private static void printApplicationFooter() {
        System.out.println("==================================================");
        System.out.println("              APPLICATION FINISHED");
        System.out.println("==================================================");
        System.out.println("All demonstration methods have been called.");
        System.out.println("The main method is reaching its end.");
        System.out.println("Thank you for practicing Java.");
        System.out.println("Keep coding and keep learning.");
        System.out.println("==================================================");
    }
}
