public class Throw {
    public static void main(String[] args) {
     int i = 20;
    int j = 0;
try{
    j = 18/i;
    if(j == 0)
        throw new ArithmeticException("i donot want to print");
}
catch(ArithmeticException e)
{
    j =18/i;
    System.out.println("that the fault output" + e);

}
}
}


