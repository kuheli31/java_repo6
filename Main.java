import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter target=");
        int target = sc.nextInt();
        
        System.out.print("Enter any five numbers=");
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        Solution solution = new Solution();
        int[] result = solution.twoSum(arr, target);
        
        if (result != null) {
            System.out.println("The indices are=[" + result[0] + "," + result[1] + "]");
        } else {
            System.out.println("No pairs found that sum to the target.");
        }
        
        sc.close();
    }
}
