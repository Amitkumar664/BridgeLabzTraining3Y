package JavaString1;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'l';
        System.out.println(removeChar(str, ch));
    }

    public static String removeChar(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) sb.append(c);
        }
        return sb.toString();
    }
}

