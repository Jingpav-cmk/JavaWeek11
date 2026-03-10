public class PassByValueExample {

       public static   void main(String[] arrgs){
              int  number  = 10;
               System.out.println("Before changeValue:"+number);
               changeValue(number);
               System.out.println("After changeValue:"+number);
       }

       public static void changeValue(int number){
              number = 50;
       }
}
