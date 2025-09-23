package JavaString1;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (result.indexOf(c) == -1) result += c;
        }
        return result;
    }
}

