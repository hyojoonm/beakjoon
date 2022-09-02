import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class bj_1436 {
    public static void main(String[] args)throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int NUM = 666;
        int count = 1;

        while (count!=N){ // 카운트가 입력값과 같아질때까지 반복 == 카운트가 입력값과 같지 않다면 반복
            NUM++; //666에서부터 ++을 반복

            if(String.valueOf(NUM).contains("666")){ //검사하려는 문자열이 있는지 판단하는contains, 자료형을 바꿔주는 valueof,
                count++; // 만약늘어나는 NUM의 값에 666이 연속되어져 포함되어있다면 카운트를 진행,  ex) 첫번째 while에서 NUM 은 666를 포함하니 카운트가 1
            }
        }

        System.out.println(NUM);
    }
}
