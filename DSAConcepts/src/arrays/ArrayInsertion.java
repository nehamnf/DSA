package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = new int[]{10,2,3,13,9,6};
        int[] newArray = new int[arr.length+1];
        System.out.println("Original Array: "+Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be inserted");
        int element = sc.nextInt();
        System.out.println("Enter position to be inserted");
        int position = sc.nextInt();

        for(int i=0;i < position ;i++){
            newArray[i] = arr[i];
        }

        for(int j=newArray.length-1;j>=position;j--){
            newArray[j] = arr[j-1];
        }

        newArray[position-1] = element;

        System.out.println("New Array: "+Arrays.toString(newArray));
    }
}
