abstract class Car //abstract class
{
    public abstract void drive();  // abstract method
    public void playmusic()
    {
        System.out.println("play music");
    }
}
class WagonR extends Car{

    public void drive() {
         System.out.println("in drive");
    }

}
public class AbstractKeywords
{
    public static void main(String[] args) {
        Car obj = new WagonR();  // you didnt take the abstract class as a making of object
        obj.drive();
        obj.playmusic();
    }
}