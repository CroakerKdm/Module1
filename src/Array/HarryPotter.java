package Array;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module1
 * @class HarryPotter
 * @since 14.03.2021 - 16.02
 **/

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class HarryPotter {

    public static String[] add(String newWord, String[] distinctWords) {
        String[] distinctWordsNew = new String[distinctWords.length + 1];
        System.arraycopy(distinctWords, 0, distinctWordsNew, 0, distinctWords.length);
        distinctWordsNew[distinctWords.length] = newWord;
        return distinctWordsNew;
    }

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("distinctWords.txt");
        String text = new String(Files.readAllBytes(Paths.get("HarryPotter.txt")));
        text = text.replaceAll("[^A-Za-z ']", "");

        String[] words = text.split(" ");

        StringBuilder stringOfDistinct = new StringBuilder();

        for (String word : words) {
            if (!stringOfDistinct.toString().contains(word)) {
                stringOfDistinct.append(word).append(" ");
            }
        }

        String[] distinctWords = stringOfDistinct.toString().split(" ");

        Arrays.sort(distinctWords);
        System.out.println("Number of distinct words: " + distinctWords.length);

        for (String word : distinctWords) {
            fw.write(word + "\r\n");
        }
    }
}
