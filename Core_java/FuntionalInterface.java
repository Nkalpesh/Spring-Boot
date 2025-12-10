interface A
{
    void show();

}

public class FuntionalInterface {
    public static void main(String[] args) { // you donot creat the method using A 
                                // you want to creat method you need anonymons innerclass (instantiate on it)
    
        A obj = new A(){
            public void show()
            {
                System.out.println("in show");
            }

        };                     
       obj.show();
    }
}
