public class Main {
        public static void main(String[] args) {

            System.out.println("LONGEST: ");
            Ass1.longestSubsequence("assignment", "assessment");
            System.out.println();
            System.out.println("LONG STRING: ");
            Ass1.longSubString("stupid", "dummy");
            System.out.println();
            System.out.println("NOT FIBO: ");
            Ass1.notFibonacci(30);
            System.out.println();
            System.out.println("WHERE?: ");
            Ass1.whereInSequence(100);
            System.out.println();
            System.out.println("REMOVE: ");
            System.out.println();
            int[] nums = {3, 3, 6, 7, 1, 2, 3, 4, 5, 5, 4, 7, 8, 1, 1, 3};
            int val = 3;
            int result = Ass1.removeElement(nums, val);
            System.out.print(result + "\n");
            for(int i = 0; i < result; i++){
                System.out.print(nums[i]);
            }
            System.out.println();
            System.out.println("Ass1");


        }
}
