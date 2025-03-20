import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the linked list: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

       
        System.out.println("Enter " + n + " elements of the linked list:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        reverseArray(arr);

        System.out.println("Reversed Linked List:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}



