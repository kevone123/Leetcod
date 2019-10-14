import java.util.HashMap;
import java.util.Map;

public class stringGame {
    public  static String  stg(String a){
        int[]buff=new int[a.length()];
        StringBuilder newS=new StringBuilder();
        for(int i=0;i<buff.length;i++){
            //store it and create new string
           if(buff[a.charAt(i)-'a']==0){
                buff[a.charAt(i)-'a']+=1;
                newS.append(a.charAt(i));
            }
        }
        if(newS.length()%2==1){
            return "Player 1";
        }   else{
                return "Player 2";
        }



    }
    public static void main(String[]args){
        String first="abc";
        System.out.println(stg(first));

    }
}
