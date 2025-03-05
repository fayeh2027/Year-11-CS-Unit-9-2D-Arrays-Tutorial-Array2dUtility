public class Array2dUtility {

    // 1. Print the values of a 2D array
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2. Return the sum of a 2D array
    public static int sum(int[][] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
        }
        return total;
    }

    // 3. Return the average value of a 2D array
    public static double average(int[][] array) {
        int totalSum = sum(array);
        int totalElements = array.length * array[0].length; // Assuming square array
        return (double) totalSum / totalElements;
    }

    // 4. Return the minimum value of a 2D array
    public static int minimum(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    // 5. Return the maximum value of a 2D array
    public static int maximum(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    // 6. Count even numbers using standard for loop
    public static int evenCountStandard(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 7. Count even numbers using standard for loop (no enhancements)
    public static int evenCountEnhanced(int[][] array) {
        return evenCountStandard(array); // Reusing the standard method
    }

    // 8. Check if all values are positive
    public static boolean allPositive(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. Return the sum of each row
    public static int[] rowSums(int[][] array) {
        int[] sums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            sums[i] = sum;
        }
        return sums;
    }

    // 10. Return the sum of each column
    public static int[] colSums(int[][] array) {
        int[] sums = new int[array.length];
        for (int j = 0; j < array.length; j++) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            sums[j] = sum;
        }
        return sums;
    }
}