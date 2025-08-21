package JavaString.level1;

public class NullPoinExcep {
 public static void main(String[] args) {
        String txt = null;  // text is null

        // check for null before accessing length
        if (txt != null) {
            System.out.println("Length: " + txt.length());
        } else {
            System.out.println("String is null, cannot find length.");
        }
    }
}
