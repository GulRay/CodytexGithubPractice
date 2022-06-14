public class ReverseString {

    public static void main(String[] args) {
        String word = "Codytex";
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
            System.out.print(reverse);
        }
    }

