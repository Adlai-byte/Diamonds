import java.util.Scanner;
public class diamond
{
    public static void main(String args[]) 
    {
        int a=1;
	int b=1;
	int c=1;
	int gap= 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        gap = a - 1;
        for (c = 1; c <= a; c++) 
        {
            for (b = 1; b <= gap; b++) 
            {
                System.out.print(" ");
            }
            gap--;
            for (b = 1; b <= 2 * c - 1; b++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        gap = 1;
        for (c = 1; c <= a - 1; c++) 
        {
            for (b = 1; b <= gap; b++) 
            {
                System.out.print(" ");
            }
            gap++;
            for (b = 1; b <= 2 * (a - c) - 1; b++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}