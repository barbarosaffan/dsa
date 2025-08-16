package neetcode.problems;

import java.util.HashMap;
import java.util.Objects;

public class ValidAnagram {
    private final String s = "racecar";
    private final String t = "carrace";
    private final char[] sArr = s.toCharArray();
    private final char[] tArr = t.toCharArray();

    HashMap<Character, Integer> sMap = new HashMap<>();
    HashMap<Character, Integer> tMap = new HashMap<>();

    public Boolean Solve() {
        boolean result = true;
        for (char sChar : sArr) {
            if (sMap.containsKey(sChar)) {
                sMap.put(sChar, sMap.get(sChar) + 1);
            } else {
                sMap.put(sChar, 1);
            }
        }

        for (char tChar : tArr) {
            if (tMap.containsKey(tChar)) {
                tMap.put(tChar, tMap.get(tChar) + 1);
            } else {
                tMap.put(tChar, 1);
            }
        }

        for (var sKey : sMap.keySet()) {
            if (!tMap.containsKey((sKey))) result = false;
            if (!Objects.equals(tMap.get(sKey), sMap.get(sKey))) result = false;
            if (tMap.size() != sMap.size()) result = false;
        }
        return result;
    }
}
