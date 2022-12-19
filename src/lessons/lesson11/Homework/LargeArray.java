package lessons.lesson11.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LargeArray {
    /*
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

 */
    public static void main(String[] args) throws IOException {
        int[] largeArray = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int[] small1 = new int[5];
        int[] small2 = new int[5];
        small1 = Arrays.copyOfRange(largeArray,0,5);
        small2 = Arrays.copyOfRange(largeArray,5,10);
        for (int i = 0; i < small2.length; i++) {
            System.out.println(small1[i]);
            System.out.println(small2[i]);
        }
    }
}
