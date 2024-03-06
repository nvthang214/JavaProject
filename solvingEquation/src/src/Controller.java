/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emlad
 */
public class Controller {

    public static void menu() {
        System.out.println("=========Equation Program=========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Select an option: ");
    }

    public static void cal() {
        while (true) {
            menu();
            int choice = Validation.getChoice();
            switch (choice) {
                case 1:
                    solveSuperlativeEquation();
                    break;
                case 2:
                    solveQuadraticEquation();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    public static void solveSuperlativeEquation() {
        System.out.print("Enter A:");
        int a = Validation.getInt();
        System.out.print("Enter B:");
        int b = Validation.getInt();

        List<Float> solution = calculateEquation(a, b);
        if (solution == null) {
            System.out.println("No solution exists.");
        } else if (solution.size() == 2) {
            System.out.println("Infinitely many solutions.");
        } else {
            System.out.println("Solution: x = " + solution.get(2));
            displayProperties(solution);
        }
    }

    public static void solveQuadraticEquation() {
        System.out.print("Enter A:");
        int a = Validation.getInt();
        System.out.print("Enter B:");
        int b = Validation.getInt();
        System.out.print("Enter C:");
        int c = Validation.getInt();

        List<Float> solutions = calculateQuadraticEquation(a, b, c);
        if (solutions == null) {
            System.out.println("No solution exists.");
        } else if (solutions.size() == 3) {
            System.out.println("Infinitely many solutions.");
        } else {
            System.out.printf("Solutions: x1 = %.2f, x2 = %.2f\n", solutions.get(3), solutions.get(4));
            displayProperties(solutions);
        }
    }

    public static List<Float> calculateEquation(int a, int b) {
        List<Float> solution = new ArrayList<>();
        solution.add((float) a);
        solution.add((float) b);
        if (a == 0) {
            if (b == 0) {
                // Infinitely many solutions
            } else {
                // No solution
                return null;
            }
        } else {
            float x = -b / a;
            solution.add(x);
        }

        return solution;
    }

    public static List<Float> calculateQuadraticEquation(int a, int b, int c) {
        List<Float> solutions = new ArrayList<>();
        solutions.add((float) a);
        solutions.add((float) b);
        solutions.add((float) c);

        if (a == 0 && b == 0 && c == 0) {
            return solutions;
        }
        float delta = b * b - 4 * a * c;

        if (delta < 0) {
            return null;
        } else if (delta == 0) {
            float x = -b / (2 * a);
            solutions.add(x);
            solutions.add(x);

        } else {
            float x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
            float x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
            solutions.add(x1);
            solutions.add(x2);
        }

        return solutions;
    }

    public static boolean isPerfectSquare(float number) {
        double sqrt = Math.sqrt(number);
        return sqrt == Math.floor(sqrt);
    }

     public static void displayProperties(List<Float> solutions) {
        List<Float> odd = new ArrayList<>();
        List<Float> even = new ArrayList<>();
        List<Float> perfect = new ArrayList<>();

        for (float solution : solutions) {
            if (solution % 2 == 0) {
                even.add(solution);
            } else {
                odd.add(solution);
            }

            if (isPerfectSquare(solution)) {
                perfect.add(solution);
            }
        }

        displayNumbers("Odd", odd);
        displayNumbers("Even", even);
        displayNumbers("Perfect", perfect);
    }

    public static void displayNumbers(String label, List<Float> numbers) {
        if (!numbers.isEmpty()) {
            System.out.print("Numbers are " + label + ": ");
            for (float number : numbers) {
                System.out.printf("%.2f ", number);
            }
            System.out.println();
        }
    }

}
