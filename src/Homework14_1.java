import java.util.Arrays;

public class Homework14_1 {


    public static void main(String[] args) {


        int[] massive = new int[100];
        int sum = 0;

        for (int i = 1; i < 100; i += 10){
            massive[i]  = 111 + (i * 111);


            sum += massive[i];


        }
        System.out.println(Arrays.toString(massive));
        System.out.println(sum);








    }
}
