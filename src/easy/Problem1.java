package easy;
/*
    选择排序法思想
 */
public class Problem1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {// 做第i趟排序
            int k = i;
            for(int j = k + 1; j < nums.length; j++){//
                if(nums[k] + nums[j] == target){
                    result[0] = k;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] p = {2, 7, 11, 15};
        twoSum(p,9);
    }
}
