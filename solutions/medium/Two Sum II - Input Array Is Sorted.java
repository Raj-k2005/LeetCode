// Title: Two Sum II - Input Array Is Sorted
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/two-sum-ii---input-array-is-sorted/

                return new int[]{left+1, right+1};
            }
            else if (sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
