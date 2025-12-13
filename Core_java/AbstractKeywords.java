abstract class Car //abstract class
{
    public abstract void drive();  // abstract method
    public void playmusic()
    {
        System.out.println("play music");
    }
}
abstract class WagonR extends Car{

    public void drive() {
         System.out.println("in drive");
    }

}
class bike extends WagonR{


}
public class AbstractKeywords
{
    public static void main(String[] args) {
        Car obj = new bike();  // you didnt take the abstract class as a making of object
        obj.drive();
        obj.playmusic();
    }
}