import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Massiv {
    public void array () {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите кол-во элементов массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        String array[] = new String[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.next(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
    }
    }

