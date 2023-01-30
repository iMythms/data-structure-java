package Lab01;

public class Exercise1 {
    public static void main(String[] args) {

        // declare arry
        double[] arr = { 1, 9, 2, 9, 3.5, 4, 3, 5 };
        System.out.println(findSum(arr));
        System.out.println(findMax(arr));

        double value = 3.5;
        System.out.println(findValue(arr, value));
    }

    // Calculate the sum
    public static double findSum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // check if the value is inside array
    public static String findValue(double[] arr, double value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i])
                return "Yes";
        }
        return "No";
    }

    // find the maximum element
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
