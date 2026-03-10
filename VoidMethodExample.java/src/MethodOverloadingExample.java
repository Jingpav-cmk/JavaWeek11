public class MethodOverloadingExample {
       public  static void main(String[] args) {
             int sum1 = add(5,7);
             double  sum2 = add(3.5 ,5.6);
             int sum3 = add(1,2,4);

             System.out.println("Sum  of  2 integer :"+sum1);
           System.out.println("Sum of  2  double  :"+sum2);
           System.out.println("Sum of  3  integerr  :"+sum3);

       }


       public static int add(int a,int b){
           return a+b;
       }

       public static double add(double a,double b){
           return a+b;
       }
       public static  int add(int a, int  b,int c){
           return a+b+c;
       }
}



