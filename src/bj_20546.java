import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_20546 {
    public static int funcOne(int money,int[] arr,int last){
        int count =0;
        for(int price : arr){
            if(money >= price) {
                count += money / price;
                money %= price;
            }
        }
        return money + count * last;
    }

    public static int funcTwo(int money,int[] arr,int last){
        int count = 0 , upCount = 0,downCount = 0;

        for(int i = 1 ; i< arr.length;i++){
            if(arr[i] > arr[i-1]){
                downCount = 0;
                if(upCount <2){
                    upCount++;
                }
                else{
                    money += arr[i] *count;
                    count = 0;
                }
            }
            else if(arr[i] <arr[i-1]){
                upCount = 0;
                if(downCount<2){
                    downCount++;
                }
                else{
                    count += money/arr[i];
                    money %= arr[i];
                }
            }
        }
        return money + count * last;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int money = Integer.parseInt(br.readLine());

        int[] arr = new int[13];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<13;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int last = Integer.parseInt(st.nextToken());

        int first = funcOne(money, arr, last);
        int second = funcTwo(money, arr, last);

        if (first == second)
            System.out.println("SAMESAME");
        else
            System.out.println(first > second ? "BNP" : "TIMING");

    }
}
