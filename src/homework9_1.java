import java.util.Scanner;

public class homework9_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int allTheWay = scanner.nextInt();
        int travelTime = scanner.nextInt();
        int kmPerHours = scanner.nextInt();
        if ((travelTime * kmPerHours) > allTheWay / 2){
            System.out.println("Джон ближе к Мери");
        }
        else {
            System.out.println("Джон ближе к Шерлоку");
        }

    }
}
