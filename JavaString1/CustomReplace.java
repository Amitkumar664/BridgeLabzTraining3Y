package JavaString1;

public class CustomReplace {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(replace(str, "World", "Java"));
    }

    public static String replace(String str, String oldStr, String newStr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i <= str.length() - oldStr.length() && str.substring(i, i + oldStr.length()).equals(oldStr)) {
                sb.append(newStr);
                i += oldStr.length();
            } else {
                sb.append(str.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}

