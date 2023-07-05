package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.split("[,. ]+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!word.isBlank()) {
                map.merge(word.toLowerCase(), 1, Integer::sum);
            }
        }

        return map;
    }
}
