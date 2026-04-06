import java.util.Scanner;
public class SentenceModifier 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence terminated by '.', '?', or '!': ");
        String inputSentence = sc.nextLine();
        // Convert the sentence to uppercase
        String uppercaseSentence = inputSentence.toUpperCase();
        // Split the sentence into words
        String[] words = uppercaseSentence.split(" ");
        // Initialize a StringBuilder to store the modified sentence
        StringBuilder modifiedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder modifiedWord = new StringBuilder();
            // Iterate through each character in the word
            for (char ch : word.toCharArray()) {
                if (ch == 'A') {
                    modifiedWord.append('E'); // Replace 'A' with 'E'
                } else if (ch == 'E') {
                    modifiedWord.append('I'); // Replace 'E' with 'I'
                } else if (ch == 'I') {
                    modifiedWord.append('O'); // Replace 'I' with 'O'
                } else if (ch == 'O') {
                    modifiedWord.append('U'); // Replace 'O' with 'U'
                } else if (ch == 'U') {
                    modifiedWord.append('A'); // Replace 'U' with 'A'
                } else if (Character.isLetter(ch)) {
                    modifiedWord.append((char) (ch - 1)); // Replace consonants with the previous alphabet
                } else {
                    modifiedWord.append(ch); // Keep non-alphabetic characters unchanged
                }
            }
            modifiedSentence.append(modifiedWord).append(" ");
        }
        // Remove the trailing space and display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence.toString().trim());
        sc.close();
    }
}
