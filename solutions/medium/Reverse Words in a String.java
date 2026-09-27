// Title: Reverse Words in a String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/reverse-words-in-a-string/

    while (i < n) {
        
        while (i < n && arr[i] != ' ') {
            arr[r++] = arr[i++];
        }
        if (l < r) {
            // Reverse  word between l and r-1
            reverse(arr, l, r - 1);
            if (r < n) {
                arr[r++] = ' '; // add space
            }
            l = r;
        }
        i++;
    }

    //  Build final string
    String str=new String(arr, 0, r).trim();
