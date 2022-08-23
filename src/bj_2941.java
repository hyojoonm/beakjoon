import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj_2941 {

    public static void main(String[] args) throws IOException {
        //c= , c- , dz= , d- , lj , nj , s= , z=
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String CroStr = br.readLine();
        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        for (int i = 0; i < croatias.length; i++) {
            if (CroStr.contains(croatias[i]))
                CroStr = CroStr.replace(croatias[i], "@");
        }
        System.out.println(CroStr.length());


    }
}
