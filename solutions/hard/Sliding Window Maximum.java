// Title: Sliding Window Maximum
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/sliding-window-maximum/

            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[right]){
                deque.pollLast();
            }
            deque.addLast(right);

            if(right>=k-1){
                result[right-k+1]=nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
