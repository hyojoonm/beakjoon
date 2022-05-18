import java.util.Scanner;

public class bj_2440 {
    public static void main(String args[])
    {

        Scanner in = new Scanner(System.in);

        int C = in.nextInt();

        for(int i= 0 ;i<C;i++) {
            String[] str = in.next().split(",");

            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);

            System.out.println(A + B);


        }
        in.close();
    }
}
