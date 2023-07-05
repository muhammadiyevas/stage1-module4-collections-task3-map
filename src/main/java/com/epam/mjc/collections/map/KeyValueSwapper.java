package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> mapList = new HashMap<>();
        sourceMap.forEach((key, value )->  mapList.merge(value, key, Integer::min));
        return mapList;
    }
}
