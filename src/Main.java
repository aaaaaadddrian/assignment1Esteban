public class Main {
        public static void main(String[] args) {

//        longSubString("stupid", "dummy");
//        notFibonacci(30);
//        whereInSequence(100);
            int[] nums = {3, 3, 6, 7, 1, 2, 3, 4, 5, 5, 4, 7, 8, 1, 1, 3};
            int val = 3;
            int result = Ass1.removeElement(nums, val);
            System.out.print(result + "\n");
            for(int i = 0; i < result; i++){
                System.out.print(nums[i]);
            }


        }
}
