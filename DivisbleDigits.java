import java.util.*;
public class DivisbleDigits{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      String number = String.valueOf(num);
      String[] arrOfDigits = number.split("");
      int counter = 0;
      for(int i = 0; i < arrOfDigits.length;i++){
         if(Integer.parseInt(arrOfDigits[i]) == 0){
            //no check needed
         }
         else{
            if(num%Integer.parseInt(arrOfDigits[i]) == 0)
               counter+=1;      
         }
      
      }
      System.out.println("# of digits able to divide " + num + " is: " + counter);

   }
}