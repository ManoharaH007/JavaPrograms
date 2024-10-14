import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        int sum = calculateSumOfDigits(number);
        
 
        System.out.println("The sum of the digits is: " + sum);
        
        scanner.close();
    }

 
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        int temp = Math.abs(number); 
        
       
        while (temp > 0) {
            sum += temp % 10; 
            temp /= 10;       
        }
        
        return sum;
    }
}
