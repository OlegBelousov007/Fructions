import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction fractions = new Fraction();
        Scanner fruc = new Scanner(System.in);
        System.out.println("Введите 1-й числитель: ");
        int numerator1 = fruc.nextInt();
        System.out.println("Введите 1-й знаменатель: ");
        int denominator1 = fruc.nextInt();
        Fraction fr1 = new Fraction(numerator1, denominator1);

        System.out.println("Введите 2-й числитель: ");
        int numerator2 = fruc.nextInt();
        System.out.println("Введите 2-й знаменатель: ");
        int denominator2 = fruc.nextInt();
        Fraction fr2 = new Fraction(numerator2, denominator2);
        Fraction sum = fr1.sum(fr2);
        System.out.println("Ответ: " + sum);

    }
}