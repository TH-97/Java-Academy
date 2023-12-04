package Override_Overload;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int name_len = name.length();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < name_len ;i++){
            list.add(name.substring(i,name_len));
        }
        Collections.sort(list);
        for(int i  = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        sc.close();
    }
}