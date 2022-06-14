public class ReverseString {

    public static void main(String[] args) {
        String word = "Codytex";

        for (int i = word.length()-1; i>=0; i--) {
            System.out.print(word[i]);
        }
}
