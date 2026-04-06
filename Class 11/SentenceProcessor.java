import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class SentenceProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence (terminated by '.', '?', or '!'): ");
        String sentence = scanner.nextLine();

        // Task (i): Convert the sentence to uppercase.
        String uppercaseSentence = sentence.toUpperCase();
        System.out.println("Uppercase Sentence: " + uppercaseSentence);

        // Task (ii): Obtain the length of the sentence (measured in words).
        int wordCount = getWordCount(sentence);
        System.out.println("Word Count: " + wordCount);

        // Task (iii): Rearrange the sentence according to the size of the words in ascending order.
        String[] words = getWordsUsingTokenizer(sentence);
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println("Sentence Rearranged by Word Length:");
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            System.out.print(word + " ");
            // Add space after each word except the last one
            if (i < words.length - 1) {
                System.out.print(" ");
            }
        }
    }
    // Helper method to get the word count in a sentence.
    private static int getWordCount(String sentence) 
    {
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        return tokenizer.countTokens();
    }
    // Helper method to get words using StringTokenizer.
    private static String[] getWordsUsingTokenizer(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        String[] words = new String[tokenizer.countTokens()];
        int index = 0;

        while (tokenizer.hasMoreTokens()) {
            words[index++] = tokenizer.nextToken();
        }

        return words;
    }
}
