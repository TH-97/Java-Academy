import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            String i = br.readLine();
            bw.write(i);
            bw.flush();
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
