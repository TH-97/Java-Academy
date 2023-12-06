import java.util.*;

public class Main2635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> num_list = new ArrayList<>();

        //random 대신에
        for(int i = num/2; i < num; i++){
            List<Integer> num_test = new ArrayList<>();
            num_test.add(num);
            int num2 =num;
            int num3 =i;
            while (true){
                if(num2 < 0) break;
                int num4 =num2;
                if(num3 >= 0)num_test.add(num3);
                num2 = num3;
                num3 = num4 -num2;
            }
            if(num_list.size() < num_test.size()){
                num_list = num_test;
            }
        }
        System.out.println(num_list.size());
        for(Integer i:num_list){
            System.out.print(i + " ");
        }
    }
}
