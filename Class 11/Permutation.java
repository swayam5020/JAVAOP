import java.util.Scanner;

public class Permutation{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("All permutations of " + str + " are:");
        generatePermutations(str, 0, str.length()-1);
    }
    
    public static void generatePermutations(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
            return;
        }
        for (int i = start; i <= end; i++) {
            str = swap(str, start, i);
            generatePermutations(str, start+1, end);
            str = swap(str, start, i);
        }
    }
    
    public static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
}
