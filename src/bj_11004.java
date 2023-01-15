import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr =new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i= 0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr,0,n-1,k-1);

        System.out.println(arr[k-1]);
    }

    private static void quickSort(int[] arr, int s, int e, int k) {
        if(s<e){
            int pivot = partition(arr,s,e);
            if (pivot == k)
                return;
            else if (k < pivot)
            {
                quickSort(arr,s,pivot-1,k);
            }
            else
                quickSort(arr,pivot+1,e,k);
        }
    }

    private static int partition(int[] arr, int s, int e) {
        if(s+1 == e){
            if(arr[s] > arr[e])
                swap(arr,s,e);
            return e;
        }
        int m = (s+e)/2;
        swap(arr,s,m);
        int pivot = arr[s];

        int i = s+1 , j =e;

        while (i <=j){
            while (pivot < arr[j] && j >0){
                j--;
            }
            while (pivot > arr[i] && i< arr.length-1){
                i++;
            }
            if (i <= j){
                swap(arr,i++,j--);
            }
        }

        arr[s] = arr[j];
        arr[j] = pivot;
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
