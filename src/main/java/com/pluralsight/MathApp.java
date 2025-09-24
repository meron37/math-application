package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // 1. Salaries
        double bobSalary = 50000;
        double garySalary = 60000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        // 2. Smallest of carPrice and truckPrice
        int carPrice = 15000;
        int truckPrice = 20000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is: " + lowestPrice);

        // 3. Area of a circle (radius = 7.25)
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);

        // 4. Square root of a variable set to 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is: " + squareRoot);

        // 5. Distance between (5, 10) and (85, 50)
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between the points is: " + distance);

        // 6. Absolute value of -3.8
        double value = -3.8;
        double absValue = Math.abs(value);
        System.out.println("The absolute value of " + value + " is: " + absValue);

        // 7. Random number between 0 and 1
        double random = Math.random();
        System.out.println("A random number between 0 and 1 is: " + random);

        // 8. Minutes in 24 days (and milliseconds)
        int days = 24; // total days
        int hoursPerDay = 24;
        int minutesPerHour = 60;

        int totalMinutes = days * hoursPerDay * minutesPerHour;     // 34,560
        int totalSeconds = totalMinutes * 60;                        // 2,073,600
        long totalMilliseconds = totalSeconds * 1000L;               // 2,073,600,000

        System.out.printf("There are %,d minutes in %d days.%n", totalMinutes, days);
        System.out.printf("That's %,d seconds or %,d milliseconds.%n", totalSeconds, totalMilliseconds);
    }
}