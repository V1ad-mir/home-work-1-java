//2) Вывести все простые числа от 1 до 1000
public class Task1_2 {
    public static void main(String[] args) {
        int number = 1000;
        System.out.println(simple_number());
    
    }

    static String simple_number() {
        String line = "2 "; // едиственное четное простое число
        for (int i = 3; i <= 1000; i += 2) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 2) line = line + i+" ";

        }

        return (line);
    }
}
