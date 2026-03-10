import static java.lang.Integer.sum;

public class LayeredMethodCalls {

        public static  void  main(String[] arrgs){
              StartProgram();
        }
        public static void StartProgram(){
               showMessage();

               int total = sum(10,20);
               System.out.println("The total is : "+total);
        }

        public  static int sum(int a , int b ){
              return a + b;
        }

        public static  void showMessage(){
               System.out.println("This is  a layered  method call  example !!");
        }


}
