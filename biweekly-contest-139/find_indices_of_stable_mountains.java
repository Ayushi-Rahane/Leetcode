import java.util.*;

import javax.management.openmbean.ArrayType;

public class find_indices_of_stable_mountains {
     public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<height.length;i++)
        {
            if(height[i-1]>threshold){
                System.out.println(height[i-1]);
               list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args){
     find_indices_of_stable_mountains f = new find_indices_of_stable_mountains();
        int[] h ={1,2,3,4,5};
        int[] h1 = {10,1,10,1,10};
        System.out.println(f.stableMountains(h1, 2));
    }
}
