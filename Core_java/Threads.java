class Hi extends Threads
{
    public void show()
    {
        for(int i= 1; i <=10; i++){
            System.out.println("Hii");

        }
    }
}
class Hello extends Threads
{
    public void show()
    {
        for(int i= 1; i <=10; i++){
            System.out.println("HELLO");
        }
    }
}
public class Threads {
    public static void main(String[] args) throws ClassNotFoundException {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        System.out.println(obj1.getPriority());
        obj1.show();
        obj2.show();

    }

}
