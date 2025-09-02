package viikko1;

public class TimesTable {
    public static String table(int n) {
        String res = "";
        
        for (int i = 1; i < 11; i++) {
            res = res + n + " x " + i + " = " + (n*i) + "\n";
        }
        return res;
    }
}
