import java.util.Scanner;

public class homework9_1 {
    public static void main(String[] args) {

        int airTemperature;


        Scanner scanner = new Scanner (System.in);

        do{
            airTemperature = scanner.nextInt();
        }while (airTemperature >= -15);
        System.out.println("Разгерметизация, пилоты погибли");


    }
}
