// Title: Group Anagrams
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/group-anagrams/

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
