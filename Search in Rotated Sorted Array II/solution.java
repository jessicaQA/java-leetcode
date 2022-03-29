class Solution {
    public boolean search(int[] nums, int target) {
        int maxIndex = nums.length - 1;
        int last = nums[maxIndex]; // last value
 
        // target is less than first number
        if (target < nums[0])
        {
            // Check the values starting from last index
            int index = nums.length - 1;
            int value = nums[nums.length - 1];

            // System.out.println ("value: " + value + ", index: " + index + ", target: " + target + ", last: " + last);

            while(value >= target){
                // System.out.println("value: " + value + ", target: " + target);
                if (target == value) // target is found in array
                {
                    return true;
                }
                // decrement by 1 until target is less than of equal to num in number
                index--;
                // System.out.println("index: " + index);
                if (index >= 0){ // not out of bounds
                    // make sure target isn't bigger than last item in num
                    value = nums[index];
                    if (value > last){
                        return false;
                    }
                }
                else // out of bounds
                {
                    return false;
                }
            }   
        }
        // target is greater than or equal to the first number
        else
        {
            // If not, increment until num number is greater than target
            int index = 0;
            int value = nums[index];
            // System.out.println("value: " + value + "target: " + target);
            while(value <= target){
                // target is found in array
                if (target == value){
                    return true;
                }
                
                index++;
                // System.out.println("index: " + index + ", maxIndex:" + maxIndex);
                if (index <= maxIndex){ // not out of bounds
                    // make sure target isn't bigger than last item in num
                    value = nums[index];
                    if (value > target){
                        return false;
                    }
                }
                else // out of bounds
                {
                    return false;
                }   
            }
        }
        return false;
    }
}
