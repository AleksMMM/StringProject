public class Task1 {
    public static void main(String[] args) {
        String value = "fdfdsfsd :( fdfdf :) :) :(";

        System.out.println(replace(value));

    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
