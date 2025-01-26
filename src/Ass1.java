public class Ass1 {

    public static int longestSubsequence(String text1, String text2){

        int[] storage = new int[text1.length()];
        int longest = 0;
        // O(m) time, m = text2.length(), cause we run through this loop m times.
        for(char c : text2.toCharArray()){
            int currLength = 0;
            // O(n) time for this loop, n = text1.length(), cause we run through it all once.
            for(int i = 0; i < storage.length; i++){
                if(currLength < storage[i]){
                    currLength = storage[i];
                } else if(c == text1.charAt(i)){
                    storage[i] = currLength + 1;
                    longest = Math.max(longest, currLength + 1);
                }
            }
        }
        System.out.println(longest);
        // O(n) time since we go through all of storage again.
        for(int i : storage){
            System.out.print(i + " ");
        }
        // Then we are at O(mn + n) but we can chop off n since mn grows faster... O(mn)
        return longest;
    }





    public static void longSubString(String text1, String text2){
        int min = Math.min(text1.length(), text2.length());
        char[] word = new char[min];

        int pointer = 0;

        if(text1.length() != min){
            String temp = text1;
            text1 = text2;
            text2 = temp;
        }

        int lastone = 0;
        int count = 0;
        char[] storage = new char[text2.length()];
        // O(min), min = min(text1.length(), text2.length()), since we loop min times;
        for(int i = 0; i < min; i++){
            // O(n), n = text2.length(), since we loop n times here;
            for(int j = lastone; j < text2.length(); j++){
                if(text1.charAt(i) == text2.charAt(j)){
                    lastone = j + 1;
                    word[count] = text2.charAt(j);
                    count++;
                    break;
                }else{
                    // O(k), k = word.length, since we loop at most k times here.
                    for(int k = 0; k < word.length; k++){
                        if(word[k] != '\u0000'){
                            storage[k] = word[k];
                            count = 0;
                        }else{
                            break;
                        }
                    }
                }
            }
        }
        // A total of O(n*min*k) time
        int letters1 = 0;
        // O(k) time cause we look through word.length again;
        for(char c: word){
            if(c != '\u0000'){
                letters1++;
            }
        }
        int letters2 = 0;
        // O(n) time since we loop through text2.length times;
        for(char c : storage){
            if(c != '\u0000'){
                letters2++;
            }
        }

        if(letters1 > letters2){
            // O(k)
            for(char c : word){
                if(c != '\u0000'){
                    System.out.print(c);
                }
            }
        } else{
            // O(n) is worse since text2.length() is bigger than text1.length();
            for(char c : storage){
                if(c != '\u0000'){
                    System.out.print(c);
                }
            }
        }
        // Thus a total of O(n*min*k) time when we chop off slower growing terms;
    }

    public static void notFibonacci(int n){
        long n_0 = 0;
        long n_1 = 1;
        System.out.print("0, 1, ");
        // O(n), n = int n, since we will loop n times, but inside our loop is just atomics;
        for(int i = 0; i < n - 2; i++){
            long currNum = 3*(n_1) + 2*(n_0);
            n_0 = n_1;
            n_1 = currNum;
            System.out.print(currNum + ", ");
        }
        // O(n) time;

    }

    public static long notFibonacciS(int n){
        long n_0 = 0;
        long n_1 = 1;

        for(int i = 0; i < n - 2; i++){
            long currNum = 3*(n_1) + 2*(n_0);
            n_0 = n_1;
            n_1 = currNum;
        }

        return n_1;

    }

    public static void whereInSequence(int k){
        int yeah = 0;
        int sure = 1;
        int count = 0;

        while(yeah < sure){
            // O(n), where n is the number of notFibonaccis we have to look through;
            if(notFibonacciS(count) > k){
                System.out.println(count - 1);
                break;
            }else{
                count++;
            }
        }
    }

    public static int removeElement(int[] nums, int val){
        int total = 0;
        int ind = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[ind] = nums[i];
                ind++;
            }
        }
        return ind;
    }





}
