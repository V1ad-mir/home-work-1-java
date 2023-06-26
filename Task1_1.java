import java.util.Scanner;

import static java.lang.Integer.parseInt;

//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для расчета суммы и произведения всех его чисел:");
        int number = parseInt(scanner.nextLine());
        System.out.println("Факториал числа "+number+" равен "+factorial(number));
        System.out.println("Сумма чисел числа "+number+ " равена "+sum_number(number));
    }

    static int factorial(int number) {
        int factorial_number = 1;
        for (int i = 1; i <= number; i++) {
            factorial_number = factorial_number * i;
        }
        return factorial_number;
    }

    static int sum_number(int number) {
        int count = 0;
        int sum = 0;
        while (count <= number) {
            sum += count;
            count++;
        }
        return sum;
    }
}