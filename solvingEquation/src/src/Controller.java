
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
        } else if (solution.isEmpty()) {
            System.out.println("Infinitely many solutions.");
        } else {
            displaySolution(solution);
            List<Float> sol = new ArrayList<>();
            sol.add((float) a);
            sol.add((float) b);
            for (Float float1 : solution) {
                sol.add(float1);
            }
            displayProperties(sol);
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
        } else if (solutions.isEmpty()) {
            System.out.println("Infinitely many solutions.");
        } else {
            displaySolution(solutions);
            List<Float> sol = new ArrayList<>();
            sol.add((float) a);
            sol.add((float) b);
            sol.add((float) c);
            for (Float float1 : solutions) {
                sol.add(float1);
            }
            displayProperties(sol);
        }
    }

    public static List<Float> calculateEquation(int a, int b) {
        List<Float> solution = new ArrayList<>();
        if (a == 0) {
            if (b == 0) {
                // Infinitely many solutions
            } else {
                // No solution
                return null;
            }
        } if(a!=0) {
            solution.add((float)-b / a);
        }

        return solution;
    }

    public static List<Float> calculateQuadraticEquation(int a, int b, int c) {
        List<Float> solutions = new ArrayList<>();

        if (a != 0) {
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
        } else {
            List<Float> ls = calculateEquation(b, c);
            if (ls != null) {
                for (Float l : ls) {
                    solutions.add(l);
                }
            }else{
                return null;
            }

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
        displayNumbers("Perfect",perfect);
    }

    public static void displayNumbers(String label, List<Float> numbers) {
        if (!numbers.isEmpty()) {
            System.out.print("Number are " + label + ": ");
            for (float number : numbers) {
                System.out.printf("%.2f ", number);
            }
            System.out.println();
        }
    }
    
    public static void displaySolution(List<Float> numbers){
        if (!numbers.isEmpty()) {
            System.out.print("Solution: ");
            
            for (float number : numbers) {
                System.out.printf("%.2f ", number);
            }
            System.out.println();
        }
    }

}
