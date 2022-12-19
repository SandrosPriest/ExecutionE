package lessons.lisson10.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework {
    /*
 Создать и заполнить массив из 10 чисел, значениями от 1 до 10
*/
    //public static void main(String[] args) throws IOException {
        /*int [] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }*/

/*
 Создать и заполнить массив из 10 чисел, значениями от 10 до 1
*/
       /* int[] arr = new int[10];
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }*/

/*
 Создать и заполнить массив из 10 чисел, значениями от 10 до 19
*/
        /*int[] array = new int[10];
        for (int i = 10; i < 20; i++) {
            System.out.println(i);
        }*/

/*
 Создать и заполнить массив из 10 чисел, значениями от 29 до 20
*/
        /*int[]array = new int[10];
        for (int i = 29; i > 19; i--) {
            System.out.println(i);
        }*/

/*
 Ввести 5 строк с клавиатуры и записать их в массив
*/
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = bufferedReader.readLine();
        String d = bufferedReader.readLine();
        String e = bufferedReader.readLine();
        String[]arrStr = new String[]{a, b, c, d, e};
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }*/

/*
 Ввести 5 чисел с клавиатуры и записать их в массив
 Вывести содержимое массива в консоль
*/
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
        int e = Integer.parseInt(bufferedReader.readLine());
        int[]array = new int[]{a, b, c, d, e};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/


/*
 Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
 Посчитать сумму элементов массива и вывести её на экран.
*/
       /* int[]array = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            array[i] = i + 20;
            sum = sum + array[i];
        }
        System.out.println(sum);
*/
/*
 Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
 Найти минимальный элемент в массиве и вывести его в консоль.
*/
        /*
        int[]array = new int[]{3674, 4783, 478, 247, 63839};

        Arrays.sort(array);
        int min = array[0];

        System.out.println(min);
*/

/*
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
3. В выполняющем методе main выведите максимальное число в консоль
*/

   /* static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void initializeArray(int[] array) throws IOException {
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public void max(int[] array) {
        Arrays.sort(array);
        System.out.println(array[10]);
    }

    public static void main(String[] args) throws IOException {
        array.initializeArray();
        max
    }



/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
}

