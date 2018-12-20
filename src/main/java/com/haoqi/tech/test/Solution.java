package com.haoqi.tech.test;

public class Solution {
    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    //main测试，方法定义static
    public static int median(int [] nums){
    	//判空
		if(nums.length==0)
			return 0;
		//索引
		int start=0;
		int end=nums.length-1;
		//快速排序
		int index=partition(nums, start, end);
		//如果数组长度为偶数
		if(nums.length%2==0){
			while(index!=nums.length/2-1){
				if(index>nums.length/2-1){
					index=partition(nums, start, index-1);
				}else{
					index=partition(nums, index+1, end);
				}
			}
		}else{
			while(index!=nums.length/2){
				if(index>nums.length/2){
					index=partition(nums, start, index-1);
				}else{
					index=partition(nums, index+1, end);
				}
			}
		}
		return nums[index];
	}
	private static int partition(int nums[], int start, int end){
		int left=start;
		int right=end;
		int pivot=nums[left];
		while(left<right){
			while(left<right&&nums[right]>=pivot){
				right--;
			}
			if(left<right){
				nums[left]=nums[right];
				left++;
			}
			while(left<right&&nums[left]<=pivot){
				left++;
			}
			if(left<right){
				nums[right]=nums[left];
				right--;
			}
		}
		nums[left]=pivot;
		return left;
	}


	public static void main(String[] args) {
		int[] m = {50, 3, 43, 4, 1};

		int temp = median(m);

		System.out.println(temp);


	}
}
