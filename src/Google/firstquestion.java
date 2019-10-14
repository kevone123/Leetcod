package Google;

public class firstquestion {
    public static String secfunc(String S, int K){
        // write your code in Java SE 8
        // start at the back loop through
        // keep a count = k+1
        // concat string if not equal to dash
        //and once its equa; to 0 add the dash
        //reverse the string
        int count = K+1;
        StringBuilder result = new StringBuilder("");
        for( int i = S.length() - 1 ; i > 0; i--){
            if( S.charAt(i)!= '-'){
                result.append(Character.toUpperCase(S.charAt(i)));
            }
            count--;
            if(count == 0 ){
                result.append('-');
                count = K+1;
            }

        }
        System.out.println(result);
        return result.reverse().toString();
    }

    public static int firstfunc(){
        return 0;
    }
    public static void main(String[]args){
        System.out.println(secfunc("2-4A0r7-4k", 3));
    }
}
