// Title: Find Numbers with Even Number of Digits
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    int numdigit=digits(num);
        return numdigit % 2 == 0;
    }

    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }

        return count;
    }
}
