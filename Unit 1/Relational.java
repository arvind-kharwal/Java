class Data1{

}
public class Relational 
{
    public static void main(String arg[])
    {
        int a,b;
        a = 10;
        b = 20;
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        // Object 
        System.out.println("objects support == and != operators");
        System.out.println(new Data1()==new Data1());
        System.out.println(new Data1()!=new Data1());
    }
    
}
