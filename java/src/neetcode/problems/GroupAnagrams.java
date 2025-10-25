package neetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {
    //    private final String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
    private final String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};


    private HashMap<Character, Integer> ConstructLetterMap(String str) {
        HashMap<Character, Integer> strLetterMap = new HashMap<>();
        char[] strChars = str.toCharArray();
        for (char strChar : strChars) {
            if (strLetterMap.containsKey(strChar)) {
                strLetterMap.put(strChar, strLetterMap.get(strChar) + 1);
            } else {
                strLetterMap.put(strChar, 1);
            }
        }
        return strLetterMap;
    }

    public ArrayList<ArrayList<String>> Solve() {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            HashMap<Character, Integer> strLetterMap = ConstructLetterMap(str);
            if (anagramMap.containsKey(strLetterMap)) {
                ArrayList<String> anagramList = anagramMap.get(strLetterMap);
                anagramList.add(str);
                anagramMap.put(strLetterMap, anagramList);
            } else {
                ArrayList<String> anagramList = new ArrayList<>();
                anagramList.add(str);
                anagramMap.put(strLetterMap, anagramList);
            }
        }

        return new ArrayList<>(anagramMap.values());
    }
}
