import java.util.Scanner;
public class bj_2438 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for(int i=1;i<a+1;i++)
        {
            for(int j=0 ;j<i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
