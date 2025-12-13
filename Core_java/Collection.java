import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Collection {
    public static void main(String[] args) {
        // Comparator<Integer> com = new Comparator<Integer>() 
        // {
        //     public int compare(Integer i, Integer j)
        //     {
        //         if(i%10 > j%10){ // compare the last digit in number
        //             return 1;
        //         }else{
        //             return -1;
        //         }
        //     }
        // };
        // List<Integer> nums= new ArrayList<>();
        // nums.add(43);
        // nums.add(16);
        // nums.add(80);
        // nums.add(54);
        // nums.add(60);
    
        // Collections.sort(nums, com);
        // System.out.println(nums);
        // Comparator<String> com = new Comparator<String>() {
        //     public int compare(Character i, Character j)
        //     {
        //       if(i.SIZE > j.SIZE ){
        //         return 1;
        //       }else{
        //         return -1;
        //       }
        //     }


        //     public int compare(String o1, String o2) {
        //         // TODO Auto-generated method stub
        //         throw new UnsupportedOperationException("Unimplemented method 'compare'");
        //     }
    // };
    // List<String> str = new ArrayList<>();
    // str.add(0,"kalpesh");
    // str.add(1, "Ishant");
    // str.add(2,"om");
    // str.add(3, "chetan");
    // str.add(4,"Niraj");
    // str.add(5, "Dheeraj");
    // Collections.sort(str,com);
    // for(String n : str ){
    //    System.out.println(str);

    //  }
    // str.forEach(n ->System.out.println(n));

         List<Integer> nums = Arrays.asList(4,8,9,1,10);
        System.out.println(nums.get(4));

         Stream<Integer> s1 = nums.stream();
         Stream<Integer> s2 = s1.filter(n -> n%2 ==0);
         Stream<Integer> s3 =  s2.map(n -> n*2);
         int result = s3.reduce(0, (c,e) -> c+e);
        
    //    int sortedValues= nums.stream()   //you can used parallelstream for multiple threads in it
    //                    .filter(n -> n%2==0)
    //                    .sorted()/getter
    //                    .map(n -> n*2)
    //                    .reduce(0, (c,e) -> c+e);
    //                 System.out.println(sortedValues);


            System.out.println(result);                  
        
         s1.forEach(n -> System.out.println(n));
            
         }
        
    }
    

