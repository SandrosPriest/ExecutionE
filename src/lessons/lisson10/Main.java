package lessons.lisson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int a = 40;
        int[] arr = new int[] {35647,75847,6553,567};
        //arr[0] = 30;*/
       /* for (int i = 0; i < arr.length; i++) {
            arr[i] = 9 - i;
            System.out.println(arr[i]);

            /*
            System.out.print(i + ":");
            System.out.print("[");
            System.out.print(arr[i]);
            System.out.print("]");
            System.out.print(" ");
        }*/
        /*int[][] array = new int[2][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }*/

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
