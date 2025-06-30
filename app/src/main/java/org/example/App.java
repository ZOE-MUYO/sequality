package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        Calculate calc = new Calculate();
        int sum1 = calc.sum(2, 3);
        double avg1 = calc.average(2, 3);
        System.out.printf("Sum of 2 and 3 is %d. Average is %.1f.%n", sum1, avg1);
        
        int sum2 = calc.sumBetween(1, 10);
        double avg2 = calc.average(1, 10);
        System.out.printf("Sum of 1 to 10 is %d. Average is %.1f.%n", sum2, avg2);
        
        int sumOdd = calc.sumOddBetween(1, 10);
        System.out.printf("Sum of odd of 1 to 10 is %d.%n", sumOdd);
        
        int sumEven = calc.sumEvenBetween(1, 10);
        System.out.printf("Sum of even of 1 to 10 is %d.%n", sumEven);
    }
}