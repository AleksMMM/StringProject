public class Task4 {
    public static void main(String[] args) {
        String val = "gffdgg , gfgfggf";
        System.out.println(countSum(val));
    }

    public static int countSum(String value) {
       int len = value.replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("!", "").length();
       return value.length() - len;
    }
}
