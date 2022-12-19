package lessons.lisson10.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solution {
    public static void main(String[] args) throws IOException {
       //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        initializeArray(array);
        int max = max(array);
        System.out.println(max);

    }
    public static void initializeArray(int[] array) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
       /* for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
    }
    public static int max(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
