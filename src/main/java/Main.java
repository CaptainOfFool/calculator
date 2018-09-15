/**
 @author by Aleksandr Durnev
 @see потом создаёт кучу html доков при создании javadoc
 @see <a href=http://nooooooooooooooo.com/>НЕ ПЕРЕХОДИТЬ ПО ЭТОЙ ССЫЛКЕ</a>
 add test for home PC
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Выберите операцию:");
        System.out.println("1.Калькулятор");
        System.out.println("2. Выбор максимальной длины слова из массива");
        Scanner check = new Scanner(System.in);
        String x = check.next();
        if (x.equals("1")) {
            Choose choose = new Choose();
            choose.Calculator();
        } else if (x.equals("2")) {
            System.out.println("вы ввели неправильное число попробуйте снова");
        }
    }
}
