package Interfaces;

import java.util.Map;

public interface ITextAnalyzer {
    int getTotalWordCount();
    Map<String, Integer> getWordFrequency();
    void filterWords(int minLength);
}
