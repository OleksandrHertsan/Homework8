import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int answer = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                if (answer == 0){
                    answer = i;
                }
            }

        }
        System.out.println(answer);




    }
}
