abstract class a
{
    abstract void display();//Here we can not create body of abstract method.
    public void fun()//This is non abstract method in abstract class.
    {
        System.out.println("This function inside the non abstract method of abstract class ");
    }
}
class b extends a{
    public void display()
    {
        System.out.println("This function inside the display method in class b, here we can use the abstract method of abstract class");
    }
}
public class AbstractClass
{
    public static void main (String[] args) 
    {
        b object=new b();
        object.display();
        object.fun();
    }
}
