package newVersion;

import java.util.*;
class MoveZeros {
    public void moveZeroes(int[] nums) {
       int i=0;
       int j=nums.length-1;
       Arrays.sort(nums);
       while(i<j){
        if(nums[i]==0){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
        }
      
        i++;
        j--;
       }
       System.out.println(Arrays.toString(nums));
       
            
        
    }
}