import java.util.Random;
import java.util.stream.*;

public class dz4 {
    public static void main(String[] args) {
        int Arr[] = new int[20];
        Random rand = new Random();
        for (int t = 0; t < Arr.length; t++) {
            Arr[t] = rand.nextInt(20);
            System.out.println(Arr[t]);
        }
        int sum=0;
        for (int j : Arr) {
            if (j > 5 && j < 45) {
                sum=sum+j;
            }
        }
        System.out.println("The sum is " + sum);
         for (int t = 0; t < Arr.length; t++) {
            if(Arr[t]%2==0) {
                System.out.println(Arr[t] + "");
            }
        }
    }
}
