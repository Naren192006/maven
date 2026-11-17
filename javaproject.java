
public class Main {
    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = new StringBuilder(s1).reverse().toString();

        // Use .equals() instead of == to compare string contents
        if (s1.equals(s2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
