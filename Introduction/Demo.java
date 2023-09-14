class Calc
{
    public int add(int x,int y)
    {
        int s = x+y;
        return(s);
    }
}
class Demo 
{
    public static void main(String args[])
    {
    int n1 = 10;
    int n2 = 20;
    Calc c = new Calc();
    int res = c.add(n1,n2);
    System.out.println(res);
    }
}
