class A 
{
    int age;
    public void show(){
        System.out.println("in A Show");
    }
    class B
    {
        public static void show()
        {
            System.out.println("in B show");
        }
    }
}


public class InnerClass 
{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.show();
    }
}
