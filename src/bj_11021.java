import java.util.Scanner;

public class bj_11021 {
    public  static void main(String[] argc)
    {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for(int i=0;i<c;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + (i+1) +": " + (a+b)  );

        }
        sc.close();
    }
}