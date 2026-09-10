// Title: Valid Parentheses
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-parentheses/

                    return false;
                }

                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }

        // Valid only if no opening brackets 
        are left
        return stack.isEmpty();
    }
}
