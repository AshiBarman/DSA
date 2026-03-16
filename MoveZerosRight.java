// Write a program to move thezeros on the right side of the  array.
import java.util.Scanner;

public class MoveZerosRight {
    public static void main(String[] args) {
        // int[] arr = {1, 0, 3, 0, 5, 0, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.print("Array after moving zeros to right: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}