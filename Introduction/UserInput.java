import java.util.Scanner;
public class UserInput
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = S.nextLine();
        System.out.println("The name is: "+name);
    }
}
