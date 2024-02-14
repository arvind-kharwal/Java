import java.util.Scanner;
public class Input {

    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = S.nextInt();
        System.out.print("The Number is: "+n);
        S.close();
    }
    
}
