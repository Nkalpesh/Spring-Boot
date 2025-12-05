public class Thisandsuper {
    public static void main(String[] args) {
        B obj = new B(5);
    }

    
}
class A
{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A int");
    }
}
class B extends A
{
    public B()
    {
        super(5);
        System.out.println("in B");

    }
    public B(int n)

    {
        super(n);  //in the this() method we can call the same class.
                   //in the super() method we can call the super class.
         System.out.println("in B int");

    }
}
