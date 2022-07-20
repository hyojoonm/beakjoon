import java.util.Scanner;
public class bj_1924 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int totalday = b;
        for(int i=0;i<a-1;i++)
        {
            totalday = totalday + month[i];
        }
        System.out.println();
        sc.close();
    }
}
