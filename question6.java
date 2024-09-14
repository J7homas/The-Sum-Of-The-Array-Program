package JavaPractice;

import java.util.Scanner;

class question6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initializing the array
        int[] array = new int[size];

        // Taking input for the elements of the array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements of the array:");
            array[i] = scanner.nextInt();
        }

        // Calculating the sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        System.out.println("The sum of all elements in the array is: " + sum);
        
        scanner.close();
    }
}