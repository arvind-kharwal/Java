class Student
{
    int roll;
    String name;
    Student(int roll,String name)
    {
        roll = roll;
        name = name;
    }
    void display()
    {
        System.out.println(roll+" "+name);
    }
}
class TestThis1{
    public static void main(String[] args) {
    Student T = new Student(10,"Arvind");
    T.display();
    }
}