class A
{
    public void show()
   {
      System.out.println("in A show");
   }
}

public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A()          //   A obj = new A()......;  in the place of ... add {..} write the class here and this class is Anonymous
        {
            public void show()
            {
                System.out.println("in anonymous class show");
            }

        };
        obj.show();
    }
    
}
