public class ValueReturningMethodExample {
       public void showSum(double a, double b, double c){
             double total  =  sum(10,20);
             System.out.println("The sum is :"+total);
       }

       public  static  double sum(double a, double b){
              return  a + b;
       }
}
