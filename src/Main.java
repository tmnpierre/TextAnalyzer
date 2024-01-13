import Classes.SimpleTextAnalyzer;
import Classes.TextFileReader;
import Interfaces.ITextAnalyzer;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TextFileReader reader = new TextFileReader();
        Map<String, Integer> wordCountMap = reader.readFile("chemin/vers/le/fichier.txt");

        ITextAnalyzer analyzer = new SimpleTextAnalyzer(wordCountMap);
        System.out.println("Nombre total de mots : " + analyzer.getTotalWordCount());
        analyzer.filterWords(3);
        System.out.println("Fréquence des mots : " + analyzer.getWordFrequency());
    }
}
