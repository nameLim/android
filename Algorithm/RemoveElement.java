package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveElement {
    public static void main(String[] args) {

    }

    public static int removeElement(int[] nums, int val) {

        if(nums.length == 0)
            return 0;

        List<Integer> numList = new ArrayList<>();
        for(int num: nums) {
            if(val!=num)
                numList.add(num);
        }

        int i=0;
        for(int num: numList){
            nums[i] = num;
            i++;
        }
        return i;
    }
}
