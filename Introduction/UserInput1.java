import java.util.Scanner;
class UserInput1{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the 1st Numer: ");
        int  a = S.nextInt();
        System.out.println("Enter the 2nd Numer: ");
        int  b = S.nextInt();
        int s = a+b;
        System.out.println("The Sum is: "+s);
    }
}