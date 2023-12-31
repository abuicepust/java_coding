import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum2 {
    public static void main(String[] args) {

        int[] nums = { 1, 2, -3, -4, 5 };
        int target = 7;
        List<Integer> Newresult = TwoSum(nums, target);
        for (int Rom : Newresult) {
            System.out.print(Rom + " ");
        }

    }

    public static List<Integer> TwoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int first = 0;
        int last = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[first] + nums[last];
            if(sum == target){
                result.add(nums[first]);
                result.add(nums[last]);
                break;
            } else if (sum < target) {
                first++;
            }else{
                last--;
            }
        }
        return result;
    }
}
