import java.util.*;
class Composite
{
    int m,n;
    int arr[][]=new int[m][n];
    int num;
    Composite(int mm, int nn )
    {
        m=mm;
        n=nn;
        arr = new int[m][n];
    }

    int isComposite(int p) 
    {
        if (p <= 1) {
            return 0;
        }
        for (int i = 2; i <= p / 2; i++) {
            if (p % i == 0) {
                return 1;
            }
        }
        return 0;
    }

    void fill()
    {
        int num = 22; // Start with the first composite number after 1
        for (int j = 0; j < n; j++) 
        {
            for (int i = 0; i < m; i++) 
            {
                while (isComposite(num) == 0) 
                {
                    num++;
                }
                arr[i][j] = num;
                num++;
            }
        }
    }
    // Function to display the array in a matrix form
    public void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    // Main method to test the Composite class
    public static void main(String[] args) {
        int m=4,n=3;
        Composite comp = new Composite(m, n);
        
        comp.fill();
        comp.display();
    }
}