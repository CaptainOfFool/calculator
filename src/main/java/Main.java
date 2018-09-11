/**
 @author by Aleksandr Durnev
 @see потом создаёт кучу html доков при создании javadoc
 @see <a href=http://nooooooooooooooo.com/>НЕ ПЕРЕХОДИТЬ ПО ЭТОЙ ССЫЛКЕ</a>
 add test for home PC
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double numb1 = in.nextDouble();
        System.out.print("Введите второе число: ");
        double numb2 = in.nextDouble();
        System.out.println("Выберете операцию: +,-,*,/ ");
        String op = in.next();
        if (op.equals("+")) {
            System.out.print("Ответ = ");
            System.out.printf("%.4f", (numb1 + numb2));
        }
        if (op.equals("-")) {
            System.out.print("Ответ = ");
            System.out.printf("%.4f", (numb1 - numb2));
        }
        if (op.equals("/")) {
            System.out.print("Ответ = ");
            System.out.printf("%.4f", (numb1 / numb2));
        }
        if (op.equals("*")) {
            System.out.print("Ответ = ");
            System.out.printf("%.4f", (numb1 * numb2));
        }
    }
}
