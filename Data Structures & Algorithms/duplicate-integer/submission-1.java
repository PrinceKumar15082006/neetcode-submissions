class Solution {
    public boolean hasDuplicate(int[] nums) {
        int flag = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = nums.length -1; j >= 0; j--){
                if (i !=j && nums[i] == nums[j]){
                 flag = 1;
                 break;
            }
                
            }
        }
         if (flag == 1)
         return true; 
         else
          return false;
}
}