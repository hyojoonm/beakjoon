import java.util.Scanner;
public class bj_8393 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int num =0;
        for(int i=0;i<=a;i++)
        {
            num += i;
        }
        System.out.println(num);
        sc.close();
    }
}
