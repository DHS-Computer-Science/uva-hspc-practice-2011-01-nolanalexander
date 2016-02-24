import java.util.Scanner;

public class GeometricInflation 
{

   public static void main(String[] args)
   { 
      int month;
      int firstNum;
      double[] array = new double[100];
      Scanner scan = new Scanner(System.in);
      
      while(!scan.hasNextInt()){
         for(int i=0;i<3;i++){
            array[i] = scan.nextDouble();
         }
         month = scan.nextInt();
         for(int i=0;i<month-3;i++){
            array[i+3] = (array[i] * array[i+1])/array[i+2];
         }
         System.out.printf("Month "+month+" cost: $%.2f",array[month-1]);
         System.out.println("");
      }
   }
}