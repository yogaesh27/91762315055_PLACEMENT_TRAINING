
import java.util.Scanner;
public class searching{
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                return mid;
            }
        }
        return -1;
    }
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {      
            for (int j = i + 1; j < nums.length; j++) {  
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of array elements");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter target element");
        int target = sc.nextInt();
        int result = search(nums, target);
        System.out.println("Index: " + result);
    }
}