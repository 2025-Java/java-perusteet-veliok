package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int t = 0;
        if (a > b) { 
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        return a + "," + b + "," + c;
    }
}
