package Array;

public class secondhighestnumber {
    public static void main(String[] args) {
        int arr[] = {100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        System.out.println("The given array is:");
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("\nSecond largest number is: " + secondLargest);
        System.out.println("Largest Number is: " + largest);
    }
}
