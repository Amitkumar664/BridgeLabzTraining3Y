package JavaString1;

public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "apple", s2 = "banana";
        System.out.println(compare(s1, s2));
    }

    public static String compare(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return (s1.charAt(i) < s2.charAt(i)) ? s1 + " comes before " + s2 
                                                    : s2 + " comes before " + s1;
            }
        }
        return (s1.length() < s2.length()) ? s1 + " comes before " + s2 : s2 + " comes before " + s1;
    }
}
