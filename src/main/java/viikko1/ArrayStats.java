package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr.length == 0) return 0.0;

        double num = 0.0;
        for (int i : arr) {
            num += i;
        }
        num = (num / arr.length);

        return num;
    }
    public static int max(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        else {
            int max = 0;
            for (int i : arr) {
                if (i > max) max = i;
            }
            return max;
        }
    }
}
