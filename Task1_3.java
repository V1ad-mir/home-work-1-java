import java.util.Scanner;


//Реализовать простой калькулятор
public class Task1_3 {
    public static void main(String[] args) {
        String[] math_expression = vvod();
        double number_1 = Double.parseDouble(math_expression[0]);
        double number_2 = Double.parseDouble(math_expression[2]);
        switch (math_expression[1]) {
            case "+":
                System.out.println(number_1 + number_2);
                break;
            case "-":
                System.out.println(number_1 - number_2);
                break;
            case "/":
                System.out.println(number_1 / number_2);
                break;
            case "*":
                System.out.println(number_1 * number_2);
                break;
            default:
                System.out.println("неверные данные");

        }


    }

    static String[] vvod() {
        System.out.println("Введите математическое выражение, знак отделить пробелом (a - b)");
        Scanner scanner = new Scanner(System.in);
        String[] math_expression = scanner.nextLine().split(" ");
        return (math_expression);
    }
}
