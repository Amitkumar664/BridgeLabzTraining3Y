package JavaString1;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";
        int[] result = countVowelsAndConsonants(str);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }

    public static int[] countVowelsAndConsonants(String str) {
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
}

