package com.proftelran.Homework.FileReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexStorage {
    private Map<Character, List<Integer>> indexMap = new HashMap<>();

    public void addIndex(Character element, int index) {
        List<Integer> indices = indexMap.getOrDefault(element, new ArrayList<>());
        indices.add(index);
        indexMap.put(element, indices);
    }

    public Map<Character, List<Integer>> getIndexMap() {
        return indexMap;
    }
}
