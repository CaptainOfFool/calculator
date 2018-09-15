import java.util.Scanner;

public class Choose {
    public void Calculator() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double numb1 = in.nextDouble();
        System.out.print("Введите второе число: ");
        double numb2 = in.nextDouble();
        System.out.println("Выберете операцию: +,-,*,/ ");
        String op = in.next();
        if (op.equals("+")) {
            System.out.print("Ответ = ");
            System.out.printf("%.4f", (numb1 + numb2 ));
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