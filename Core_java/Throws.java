class A 
{
    public void show()
    {
        try{
            Class.forName("Throws");
        }
        catch(ClassNotFoundException e){
            System.out.println("not able to find the class");

        }
    }
}
public class Throws {
    static {
        System.out.println("class loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
    
}
