import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);

        int longest = 0;

        for(int n : set) {
            if(!set.contains(n - 1)) {
                int current = n;
                int count = 1;

                while(set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest Length: " + longest);
    }
}
