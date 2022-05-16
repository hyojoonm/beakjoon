import java.util.Scanner;
public class bj_11720 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int num = 0 ;
        String str = sc.next();
        sc.close();
        for(int i = 0 ; i<c ; i++)
        {

            num += str.charAt(i) - '0';
        }
        System.out.println(num);


    }
}
