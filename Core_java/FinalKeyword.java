public class FinalKeyword {

    final int x = 10;      // final variable

    void show() {
        // x = 20; ❌ ERROR
        System.out.println(x);
    }
    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        obj.show();
    }
}
//final class :-No class can inherit a final class
//final method :-No method can override a final method
