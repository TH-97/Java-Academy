package test;

//숫자와 문자열과 영단어
public class Pro14 {
	public static void main(String[] args) {
		
		int answer = 0;
    	String s = "one4seveneight";
    	String[] englsh_num =  {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	String ran_num = s;
    	for(int i = 0; i < englsh_num.length;i++) {
    		if(ran_num.contains(englsh_num[i])) {
    		 ran_num = ran_num.replace(englsh_num[i],i+"");
    		}
    	}
    	answer = Integer.parseInt(ran_num);
    	System.out.println(answer);
    }
}  
 //   void num() {
 
 //   	return {"zero","one","two","three","four","five","six","seven","eight","nine"};
 //   }
 