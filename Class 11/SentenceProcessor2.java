import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class SentenceProcessor2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence = sc.nextLine();
        // Task (i): Convert the sentence to uppercase.
        sentence=sentence.trim();
        if(sentence.charAt(sentence.length()-1)!='.' && sentence.charAt(sentence.length()-1)!='!' && sentence.charAt(sentence.length()-1)!='?')
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        else
        {
            sentence = sentence.toUpperCase();
            System.out.println("Uppercase Sentence: " + sentence);
            // Task (ii): Obtain the length of the sentence (measured in words).
            int wordCount = getWordCount(sentence);
            System.out.println("Word Count: " + wordCount);
            // Task (iii): Rearrange the sentence according to the size of the words in ascending order.
            String[] words = getWordsUsingTokenizer(sentence);
            Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));
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
    }
    // Helper method to get the word count in a sentence.
    private static int getWordCount(String sentence) 
    {
        StringTokenizer tokenizer = new StringTokenizer(sentence,".!?");
        return tokenizer.countTokens();
    }
    // Helper method to get words using StringTokenizer.
    private static String[] getWordsUsingTokenizer(String sentence) 
    {
        StringTokenizer tokenizer = new StringTokenizer(sentence,".!?");
        String[] words = new String[tokenizer.countTokens()];
        int index = 0;
        while (tokenizer.hasMoreTokens()) {
            words[index++] = tokenizer.nextToken();
        }
        return words;
    }
}

