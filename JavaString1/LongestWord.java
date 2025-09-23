package JavaString1;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java is an object oriented programming language";
        System.out.println("Longest Word: " + findLongestWord(sentence));
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }
}

