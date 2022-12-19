package lessons.lesson11.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayStrInt {
    public static void main(String[] args) throws IOException {
        /*
1. Создать массив на 5 строк.
2. Создать массив на 5 чисел.
3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
 индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/
     String[] arrayStr = new String[5];
     int[] arrayInt = new int[5];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            arrayStr[i] = bufferedReader.readLine();
            arrayInt[i] = arrayStr[i].length();
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }
}
