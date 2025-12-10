@FunctionalInterface
interface A
{
    void show();

}

public class FuntionalInterface {
    public static void main(String[] args) { // you donot creat the method using A 
                                // you want to creat method you need anonymons innerclass (instantiate on it)
    
        A obj = () ->System.out.println("in show ");  // lambda expersion this is only in Funtional interface
                obj.show();                            //
    }
}
