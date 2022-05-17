import java.util.Scanner;
public class bj_10818 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a입력
        int[] b =  new int[a]; // 입력 받은 a만큼 배열 크기 정의
        int max = -1000001;
        int min = 1000001;
        for(int i =0;i<a;i++)
        {
            b[i] = sc.nextInt();

        }
        for(int i =0;i<b.length;i++)
        {
            if(b[i] > max)
            {
                max = b[i];
            }
            if(b[i] < min)
            {
                min = b[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        sc.close();
    }
}
