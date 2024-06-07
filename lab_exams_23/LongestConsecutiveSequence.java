package lab_exams_23;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int findLongestConsecutiveSequence(int[] nums) {
        // Create a set to store all the elements of the array
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestSequence = 0;

        // Iterate through the array to find the longest consecutive sequence
        for (int num : nums) {
            // Check if the current number is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;

                // Increment the current number to find the length of the consecutive sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }

                // Update the longest sequence if necessary
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};

        int longestSequence = findLongestConsecutiveSequence(nums);
        System.out.println("Length of the longest consecutive sequence: " + longestSequence);
    }
}
