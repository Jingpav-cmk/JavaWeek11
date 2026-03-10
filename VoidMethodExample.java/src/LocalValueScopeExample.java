public class LocalValueScopeExample {
     public static void main(String[] args) {
           methodA();
           methodB();
     }

     public  static void methodA(){
          int x = 10;
          System.out.println("methodA x :"+x);
     }

     public  static void methodB(){
         int x = 99;

         System.out.println("MethodB x :"+x);
     }
}
