class A 
{
    int age;
    public void show(){
        System.out.println("in A Show");
    }
    class B
    {
        public void show()
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
        A.B obj1 = obj.new B(); // method of writting inner class A.B and obj.new B()
        obj1.show();
    }
}
