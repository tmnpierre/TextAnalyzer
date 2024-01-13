import Classes.SimpleTextAnalyzer;
import Classes.TextFileReader;
import Interfaces.ITextAnalyzer;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TextFileReader reader = new TextFileReader();
        Map<String, Integer> wordCountMap = reader.readFile("chemin/vers/le/fichier.txt");

        ITextAnalyzer analyzer = new SimpleTextAnalyzer(wordCountMap);

        System.out.println("Nombre total de mots : " + analyzer.getTotalWordCount());

        Map<String, Integer> frequentWords = wordCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Mots fréquents : " + frequentWords);
    }
}