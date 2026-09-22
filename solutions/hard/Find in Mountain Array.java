// Title: Find in Mountain Array
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/find-in-mountain-array/


            } else {

                if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
