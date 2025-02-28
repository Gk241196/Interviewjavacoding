package Array;

public class Removeduplicatesinsortedarray {
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        System.out.println(findSecondLargest(new int[]{10, 20, 4, 45, 99, 99})); // Output: 45
    }
}
