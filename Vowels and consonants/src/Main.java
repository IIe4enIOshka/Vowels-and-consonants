import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int arr[] = new int[5];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(read.readLine());
        System.out.println("---До сортировки---");
        print(arr);
        bubbleSort(arr);
        System.out.println("---После сортировки---");
        print(arr);
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length-1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
    }
}