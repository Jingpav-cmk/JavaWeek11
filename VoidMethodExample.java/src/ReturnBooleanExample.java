public class ReturnBooleanExample {

     public  static  void main(String[] arrgs){
           int n  = 14;

           if (isEven(n)){
               System.out.println( n + "is Even number" );
           }
           System.out.println( n + "is Odd number" );
     }

     public static   boolean isEven(int n){
            return  n%2==0;
     }
}
