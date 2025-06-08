package anagrams;

import java.util.*;

public class GroupAnagramsWithWildcard {

    // Normalize: Sort characters in the string
    private static String normalize(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static List<List<String>> groupAnagramsWithWildcard(String[] words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        List<String> wildcardWords = new ArrayList<>();

        for (String word : words) {
            if (word.contains("?")) {
                wildcardWords.add(word);
            } else {
                String key = normalize(word);
                anagramGroups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }
        }

        for (String word : wildcardWords) {
            boolean matched = false;

            // Replace ? with a-z and try matching normalized version
            for (char c = 'a'; c <= 'z'; c++) {
                String replaced = word.replace('?', c);
                String key = normalize(replaced);

                if (anagramGroups.containsKey(key)) {
                    anagramGroups.get(key).add(word);
                    matched = true;
                    break;
                }
            }

            // If no match found, treat as its own group
            if (!matched) {
                anagramGroups.computeIfAbsent(word, k -> new ArrayList<>()).add(word);
            }
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        String[] input = {"bat", "tab", "t?b", "abt", "xyz", "zyx", "x?z"};
        List<List<String>> result = groupAnagramsWithWildcard(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
