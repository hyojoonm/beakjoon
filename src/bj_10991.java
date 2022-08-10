import java.util.Scanner;

public class bj_10991 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.printf(" ");
            }
            for(int j=1; j<=i*2-1; j++) {
                if(j%2==1) {
                    System.out.printf("*");}
                else{
                    System.out.printf(" ");
                }
            }System.out.println();
        }
    }
}