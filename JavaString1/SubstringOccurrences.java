package JavaString1;

public class SubstringOccurrences {
    public static void main(String[] args) {
        String text = "banana";
        String sub = "ana";
        System.out.println("Occurrences: " + countOccurrences(text, sub));
    }

    public static int countOccurrences(String text, String sub) {
        int count = 0;
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if (text.substring(i, i + sub.length()).equals(sub)) count++;
        }
        return count;
    }
}

