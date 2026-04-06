public class Tp {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            int number = i;
            for (int j = 1; j <= rows; j++) {
                System.out.print(number + " ");
                number = (number % rows) + 1;
            }
            System.out.println();
        }
    }
}

/*import java.util.*;
class Tp
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // Iterate from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // If the number is divisible by any integer in this range, it is not prime
            if (num % i == 0) {
                return false;
            }
        }

        // If no divisor is found, the number is prime
        return true;
    }
} */
/*for(i=0;i<arr.length;i++) i= 0;1
 * {
 *     for(j=0;j<arr.length;j++) j=0;1;2;0
 *     {
 *         sum += arr[i][j]; sum= 0; 0.5
 *         }
 *         if(sum!=1)
 *         return false;
 *         sum=0;
 *         }
 *         return true;
 *         
 */
 
/*Scanner sc=new Scanner(System.in);
System.out.println("Enter the dimmension of the array");
int R=sc.nextInt();
int C=sc.nextInt();
int arr[][]=new int[R][C];
int i,j;
System.out.println("Enter the elements of the array with a space between each element");
for(i=0;i<R;i++)
{
for(j=0;j<C;j++)
{
arr[i][j]=sc.nextInt();
}
}
int sumrow=0;
System.out.println("Sum of each row");
for(i=0;i<R;i++)
{
for(j=0;j<C;j++)
{
sumrow += arr[i][j];
}
System.out.println(sumrow);
sumrow=0;
}
int productrow=1;
System.out.println("Product of each row");
for(i=0;i<R;i++)
{
for(j=0;j<C;j++)
{
productrow *= arr[i][j];
}
System.out.println(productrow);
productrow=1;
}*/

