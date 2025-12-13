import java.lang.reflect.Constructor;

class Human{
   //set private varibles
   private int age;
   private int id;
   //getter
   public int getAge() {
      return age;
   }
      public int getId() { 
         return id;
      }
      
      //setter
      public void setAge(int age) {
         this.age = age;
      }
      public void setId(int id) {
         this.id = id;
      }
   }
   
   

class Demo {
   public static void main(String[] args) {
      // // HashSet<Integer> nums= new HashSet<Integer>();
      // // nums.add(9);
      // // nums.add(2);
      // // nums.add(5);
      // // nums.add(7);

      // // for(int n :nums){
      // //    System.out.println(nums);
      // // }

      // String name = new String();
      // int[] nums = new int[4];
      // System.out.println(Arrays.toString(nums));
       Human obj = new Human();
       obj.setAge(2);
       System.out.println(obj.getAge());
   }
 }
