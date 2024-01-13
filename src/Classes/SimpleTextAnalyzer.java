package Classes;

import Interfaces.ITextAnalyzer;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SimpleTextAnalyzer implements ITextAnalyzer {
    private Map<String, Integer> wordCountMap;

    public SimpleTextAnalyzer(Map<String, Integer> wordCountMap) {
        this.wordCountMap = new HashMap<>(wordCountMap);
    }

    @Override
    public int getTotalWordCount() {
        return wordCountMap.values().stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public Map<String, Integer> getWordFrequency() {
        return wordCountMap;
    }

    @Override
    public void filterWords(int minLength) {
        this.wordCountMap = wordCountMap.entrySet().stream()
                .filter(entry -> entry.getKey().length() >= minLength)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
