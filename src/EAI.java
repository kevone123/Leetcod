public class EAI {


    class Node<BinaryT>{
        BinaryT data;
        BinaryT left;
        BinaryT right;
    }

    public static boolean revString(String a, String b){
        int j=0;
        if(b==" "){
            return false;
        }
        for(int i=b.length()-1;i>0;i--) {

            if (b.charAt(i) != a.charAt(j)) {

                return false;
            }
            j++;
        }
        return true;
    }
    public static void printFooBar(){
        for(int i=1;i<=100;i++){
            if(i%7==0){
                System.out.println("Foo");
            }   else if(i%4==0) {
                System.out.println("Bar");

                }   else if(i%7==0 && i%4==0) {
                System.out.println("FooBar");
                    }
                        else{
                            System.out.println(i);
                         }
        }
    }
 public static void main(String[]args){
       String a= "apple";
       String b=" ";
       //System.out.println(revString(a,b));

       printFooBar();
 }
}
