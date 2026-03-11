// write a program which will shift even and non negative number to the left side of the array.

public class Evenleftside {
    public static void main(String[] args) {
        int[] arr = {3,-4,1,2,1,3,-1,-2};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] % 2 == 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0; 
        }

        
        System.out.print("Array after shifting even and non-negative numbers to left: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
