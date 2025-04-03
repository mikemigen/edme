import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.security.MessageDigest;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        System.out.print("Введите выражение используя целые числа и пробелы: ");
        Scanner scr = new Scanner(System.in);
        String inputString = scr.nextLine();
        String[] str = inputString.split(" ");

        if (str.length != 3){
            throw new IllegalArgumentException("Ошибка: неверный формат ввода!");
        }
        else {
            System.out.print(calc(inputString));
        }
    }

        public static String calc(String inputString){
            inputString = inputString.replaceAll(" ","");
            int n1 = Character.getNumericValue(inputString.charAt(0));
            int n2 = Character.getNumericValue(inputString.charAt(2));
            int sum = 0;
            char sym = inputString.charAt(1);
            if (n1 < 1 || n1 > 10 || n2 < 1 || n2 > 10) {
                throw new IllegalArgumentException("Ошибка: числа должны быть от 1 до 10 включительно!");
            }
            switch (sym){
                case '+': sum = n1+n2; break;
                case '-': sum = n1-n2; break;
                case '/': sum = n1/n2; break;
                case '*': sum = n1*n2; break;
            }
            return Integer.toString(sum);
        }

    }