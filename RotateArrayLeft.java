import java.util.Scanner;

public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of positions to rotate the array left: ");
        int positions = scanner.nextInt();

        rotateArrayLeft(arr, positions);

        System.out.println("Array after rotating left by " + positions + " positions:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }

    public static void rotateArrayLeft(int[] arr, int positions) {
        int n = arr.length;
        positions = positions % n; 

        reverseArray(arr, 0, positions - 1);
        reverseArray(arr, positions, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}




