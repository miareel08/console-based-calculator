
package calculator.pkg1;
import java.util.Scanner;




public class Calculator1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;    
                
        // Display the calculator menu
       System.out.println("CONSOLE CALCULATOR");
        System.out.println("Enter the First Number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the Second Number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Select Operation: ");
        System.out.println("1. Addition");
         System.out.println("2. Subtraction");
          System.out.println("3. Multiplication");
           System.out.println("4. Division");
           System.out.println("5. power");
           System.out.println("6. Square");
           System.out.println("7. Cube");
           System.out.println("8. Square root");
           System.out.println("9. Round to Nearest Integer");
           System.out.println("10. Ceiling");
           System.out.println("11. Floor");
           System.out.println("12. Minimum value");
           System.out.println("13. Maximum value");
           System.out.println("14. Sine");
           System.out.println("15. Cosine");
           System.out.println("16. Arcsine");
           System.out.println("17. Arccosine");
           System.out.println("18. Arctangent");
           System.out.println("19. Exponential");
            System.out.println("20. Check palindrome");
             System.out.println("21. Check prime");
             System.out.println("22. Check Armstrong Number");
             System.out.println("23. Calculate Average");
             System.out.println("24. Find Greatest common Divisor");
             System.out.println("25. Find Least common Multiple");
                System.out.println("26. Exit");
               
              // Prompt the user for their choice
           System.out.println("Enter Your Choice(1/2/3/4/5/6/7/8/9/10/11/12/13/14/15/16/17/18/19/20/21/22/23/24/25/26): ");
           do{
           int choice = scanner.nextInt();
           scanner.nextLine(); // Consume the newLine character
           double result = 0;
           switch (choice){
               case 1:   
                   result = num1 + num2;
                   break;
               case 2:
                   result = num1 - num2;
                   break;
               case 3:
                   result = num1 * num2;
                   break;
               case 4:
                   if (num2 !=0){
                       result = num1 / num2;
                   } else{
                       System.out.println("Error: Division by zero");            
                   }
                   break;
               case 5:
                   result = Math.pow(num2, num2);
                   break;
               case 6:
                   result = num1 * num1; // square
                   break;
               case 7:
                   result = num1 * num1 * num1 ; //cube
               case 8:
                   if (num1 >= 0){
                       result = Math.sqrt(num1);
                   }else{
                       System.out.println("Error: Cannot calculate square root of a negative number");           
                   }
                   break;
               case 9:
                   result = Math.round(num1);
                   break;
               case 10:
                   result = Math.ceil(num1);
               case 11:
                   result = Math.floor(num1);
                   break;
               case 12:
                   result = Math.min(num1, num2);
                   break;
               case 13:
                   result = Math.max(num1, num2);
                   break;
               case 14:
                   result = Math.sin(num1);
                   break;
               case 15:
                   result = Math.cos(num1);
                   break;
               case 16:
                   if(num1 >= -1 && num1 <=1){
                       result = Math.asin(num1);
                   }else{
                       System.out.println("Error Input out of range for arcsine");           
                   }      
                   break;
               case 17:
                   if(num1 >= -1 && num1 <=1){
                       result = Math.acos(num1);
                   }else{
                       System.out.println("Error Input out of range for arccosine");           
                   }
                   break;
               case 18:
                   result = Math.atan(num1);
                   break;
               case 19:
                   result = Math.exp(num1);
                   break;
               case 20:
                   if (isPalindrome((int)num1)){
                  System.out.println((int) num1 + "is a palindrome.");
               }else{
                       System.out.println((int) num1 + "is not a palindrome.");
                       }       
               case 21:
                   if (isPrime((int) num1)){
                       System.out.println((int) num1 + " is a prime number.");
                       
                   }else{
                       System.out.println((int) num1 + " is not a prime number.");
                   }      
               case 22:
                   if (isArmstrong((int)num1)){
                       System.out.println((int) num1 + "is an Armstrong.");
                   }else{
                       System.out.println((int) num1 + " is not an Armstrong. ");
                   }      
               case 23:
                   calculateAverage();    
               case 24:
                   int gcd = findGCD((int)num1, (int) num2);
                   System.out.println("Greatest common Divisor of " + (int) num1 + " and " + (int) num2 + " is " + gcd);
             
               case 25:
                   int lcm = findLCM((int) num1, (int) num2);
                   System.out.println("Least common Multiple of " + (int) num1 + " and " + (int) num2 + " is " + lcm);
                      
               case 26:
                   exit = true;
                   System.out.println("Goodbye to Console Based Calculator!");
                   break;
               default:
                   System.out.println("Invalid choice. Please select a valid option.");
                 
                   break;
               
           }
           // Display the result
           System.out.println("Result: " + result);
           // Close the scanner
           }while(!exit);
           scanner.close();
           
    }
    
    // Function to check if a number is a palindrome
    private static boolean
            isPalindrome(int num){
                int originalNum = num;
                int reverse = 0;
                while (num > 0){
                    int digit = num % 10;
                    reverse = reverse * 10 + digit;
                    num /= 10;
                }
                return originalNum == reverse;
            }
            // Function to check if a number is prime
            private static boolean isPrime(int num){
                if (num <= 1){
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(num); i++){
                    if (num % i == 0){
                        return false;
                    }
                }
                return true;
            }
            // Function to check if a number is an Armstrong number
            private static boolean isArmstrong(int num){
                int originalNum, remainder, result = 0, n = 0;
                originalNum = num;
                while (originalNum != 0){
                    originalNum /= 10;
                    ++n;
                }
                originalNum = num;
                while (originalNum !=0){
                    remainder = originalNum % 10;
                    result += Math.pow(remainder, n);
                    originalNum /= 10;
                }
                return num == result;
            }
            
             // Functions to calculate the average of numbers
            private static void calculateAverage(){
                Scanner scanner = new
                    Scanner(System.in);
                
                System.out.println("Enter the number of entries: ");
                int numEntries = scanner.nextInt();
                double sum = 0;
                if (numEntries <= 0){
                    System.out.println("Invalid number of entries. ");
                    return;
                }
                for (int i = 1; i <= numEntries; i++){
                    System.out.println("Enter entry" + i + ": ");
                    double entry = scanner.nextDouble();
                    sum += entry;
                }
                double average = sum / numEntries;
                System.out.println("Average: " + average);
                scanner.close();
            }
            // Function to find the Greatest common Divisor of two number
            private static int findGCD(int num1, int num2){
                if (num2 == 0){
                    return num1;
                }
                return findGCD(num2, num1 % num2);
            }
            // Function to find the Least common Multiple of two number
            private static int findLCM(int num1, int num2){
                if (num2 == 0){
                    return num1;
                    
                }
                return findLCM(num2, num1 % num2);
                
            }
     
    

    
    
    
}
