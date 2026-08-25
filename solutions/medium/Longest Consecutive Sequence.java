// Title: Longest Consecutive Sequence
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-consecutive-sequence/


                int currNum = num;
                int currSeq = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currSeq++;
                }

                maxSeq = Math.max(maxSeq, currSeq);
            }
        }

        return maxSeq;
    }
}
