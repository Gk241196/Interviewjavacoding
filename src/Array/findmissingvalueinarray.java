package Array;

public class findmissingvalueinarray {
        public static int findMissing(int[] arr, int n) {
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;
            for (int num : arr) actualSum += num;
            return expectedSum - actualSum;
        }
        public static void main(String[] args) {
            System.out.println(findMissing(new int[]{1, 2, 4, 5}, 5)); // Output: 3
        }
    }
    


