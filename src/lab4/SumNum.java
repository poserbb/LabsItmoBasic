package lab4;

public class SumNum {

    public int[] getNums(int num1, int num2, int num3) {
        int[] nums = {num1, num2, num3};
        return  nums;
    }

    public boolean checkNums(int[] nums) {
        int first = nums[0];
        int second = nums[1];
        int third = nums[2];

        if (first + second == third){
            return true;
        } else return false;
    }

    public boolean sortArr(int[] nums) {
        int first = nums[0];
        int second = nums[1];
        int third = nums[2];

        if ((second > first) && (third > second)) {
            return true;
        } else return false;
    }
}
