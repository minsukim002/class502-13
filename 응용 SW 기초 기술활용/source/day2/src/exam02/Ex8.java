package exam02;

import java.util.Arrays;

public class Ex8{
public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 10, 20, 30};

    for (int i = 0; i < (nums.length) / 2; i++) {
        int temp = nums[i];
        nums[i] = nums[nums.length - i - 1];
        nums[nums.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(nums));
}}
