import java.util.HashSet;
import java.util.*;

class Demo {
   public static void main(String[] args) {
      HashSet<Integer> nums= new HashSet<Integer>();
      nums.add(9);
      nums.add(2);
      nums.add(5);
      nums.add(7);

      for(int n :nums){
         System.out.println(nums);
      }
   }
 }
