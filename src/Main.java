import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 kucuk sayisini giriniz: ");
        int n1 = input.nextByte();
        System.out.print("n2 buyuk sayisini giriniz: ");
        int n2 = input.nextByte();
        int i = 1;
        int k = n1;
        int ebob=0;
        int ekok;

        while (i <= n1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;

                System.out.println(n1 + " ve " + n2 + " ebob : " + ebob);
            }
            i++;

        }
        System.out.println("----------");
        ekok=(n1*n2)/ebob;
        System.out.println("Ekok :"+ekok);
        System.out.println("Ebob"+ebob);



    }
}


