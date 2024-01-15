package test;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of side 1: ");
        int side1 = input.nextInt();
        System.out.print("Enter the length of side 2: ");
        int side2 = input.nextInt();
        System.out.print("Enter the length of side 3: ");
        int side3 = input.nextInt();
        
        int uniqueSides = 0;
        if (side1 == side2 && side2 == side3) {
            uniqueSides = 1;
        } else {
            if (side1 == side2 || side1 == side3 || side2 == side3) {
                uniqueSides = 2;
            } else {
                uniqueSides = 3;
            }
        }
        
        switch (uniqueSides) {
            case 1:
                System.out.println("This is an equilateral triangle.");
                break;
            case 2:
                System.out.println("This is an isosceles triangle.");
                break;
            case 3:
                System.out.println("This is a scalene triangle.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }
}
