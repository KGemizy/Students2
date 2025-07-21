    import java.util.Arrays;

    public class TestScores {
        public static void main(String[] args) {
            int[] scores = {85, 92, 78, 96, 88};

            // 1. Find the maximum score
            int max = Arrays.stream(scores).max().getAsInt();
            System.out.println("Maximum score: " + max);

            // 2. Calculate the sum and average
            int sum = Arrays.stream(scores).sum();
            double average = (double) sum / scores.length;
            System.out.println("Sum of scores: " + sum);
            System.out.println("Average score: " + average);

            // 3. Search for a specific value (e.g., 92)
            int searchValue = 92;
            int index = searchIndex(scores, searchValue);

            // 4. Display result
            if (index != -1) {
                System.out.println("Value " + searchValue + " found at index: " + index);
            } else {
                System.out.println("Value " + searchValue + " not found in the array.");
            }
        }

        // Method to search for a value
        private static int searchIndex(int[] arr, int value) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    return i;
                }
            }
            return -1; // if not found
        }
    }


