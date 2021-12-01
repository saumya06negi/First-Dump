import java.util.HashMap;
import java.util.*;

class rep3{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter nos.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(hm);

        LinkedHashMap<Integer, Integer> temp = new LinkedHashMap<>();
     
        hm.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
            .forEachOrdered(x -> temp.put(x.getKey(), x.getValue()));
                
            System.out.println(temp);
        
    }
}