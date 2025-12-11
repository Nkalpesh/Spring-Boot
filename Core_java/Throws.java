class A 
{
    public void show() throws ClassNotFoundException    //pervious only has show() after the throws classnotfoundexpection is add for the output
    {
       
            Class.forName("Throws");
       
    }
}
public class Throws {
    static {
        System.out.println("class loaded");
    }
    public static void main(String[] args) { // show() give you error the darg the show if you want to throw expection
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
