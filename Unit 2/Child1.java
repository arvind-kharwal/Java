class Parent{
    String name;
    Parent(String n){
        name = n;
    }
}

public class Child1 extends Parent{
    String name;
    public Child1(String n1,String n2)
    {

        super(n1);
        name =n2;
    }
    public void details()
    {
        System.out.println(super.name+" "+name);
    }
    public static void main(String[] args) {
        Child1 C = new Child1("Arvind","Amit");
        C.details();
    }
}