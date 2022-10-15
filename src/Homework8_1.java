import java.util.Scanner;

public class Homework8_1 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int number = 6;
        char last = s.charAt(s.length() - 1);
        System.out.println(s.length());
        if (s.length() > 6 || last == '!'){
            System.out.println("Ваш пароль неверный");
        }
       else{
            System.out.println("Пароль принят");
        }

    }
}
