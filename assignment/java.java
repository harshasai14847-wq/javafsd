import java.util.Scanner;

 public class SentenceInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("You entered:");
        System.out.println(sentence);

        sc.close();
    }
}