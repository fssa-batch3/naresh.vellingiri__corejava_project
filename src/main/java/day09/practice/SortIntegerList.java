package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortIntegerList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter numbers: ");
        String inputLine = scanner.nextLine();
        
        // Split the input line into individual numbers using spaces
        String[] numberStrings = inputLine.split(",");
        ArrayList<Integer> numbersList = new ArrayList<>();
        
        // Convert and store numbers in the ArrayList
        for (String numberString : numberStrings) {
            try {
                int number = Integer.parseInt(numberString);
                numbersList.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Please enter space-separated integers.");
                return;
            }
        }
        
        // Sort the ArrayList in ascending order
        Collections.sort(numbersList);
        
        // Print the sorted list
        System.out.print("Sorted list: ");
        for (int number : numbersList) {
            System.out.print(number + " ");
        }
    }
}
