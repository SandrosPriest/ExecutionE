package lessons.lesson11.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main(String[] args) throws IOException {
        String [] array = new String[10];
        initializeArray(array);
        printArray(array);
    }
    public static void initializeArray(String[] array) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            array[i] = bufferedReader.readLine();
        }
    }
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /*
В методе initializeArray():
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
В методе printArray():
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/



}
