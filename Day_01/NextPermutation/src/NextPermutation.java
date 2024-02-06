import java.util.Arrays;

public class NextPermutation {
	public void nextPermutation(int nums[]) {
		// find the first element to be swapped
		int i = nums.length - 2;
		while (i >= 0 && nums[i] >= nums[i+1]) {
			i--;
		}
		
		//If no such element is found, reverse the array
		if(i == -1) {
			reverse(nums, 0, nums.length -1);
			return;
		}
		
		//Find the smallest element to the right of nums[i] but greater than nums[i]
		int j = nums.length -1;
		while (nums[j] <= nums[i]) {
			j--;
		}
		
		//Swap nums[i] with nums[j]
		swap(nums, i, j);
		
		//Reverse the subarray to the right of nums[i]
		reverse(nums, i+1, nums.length -1);
		
	}
	
	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}

	private void reverse(int[] nums, int i, int j) {
		while(i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
		
	}

	public static void main(String[] args) {
		NextPermutation np = new NextPermutation();
		
		int num1[] = {1, 2, 3};
		np.nextPermutation(num1);
		System.out.println(Arrays.toString(num1));
		
		int num2[] = {3, 2, 1};
		np.nextPermutation(num2);
		System.out.println(Arrays.toString(num2));
		
		int num3[] = {1,  1, 5};
		np.nextPermutation(num3);
		System.out.println(Arrays.toString(num3));

	}

}
