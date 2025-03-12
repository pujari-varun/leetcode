// QUESTION
// Semester exams are going on for university students. Examiners noticed that a group of people are trying to cheat. They marked students of that group as ‘1’ and students of another group ( who are not cheating ) as ‘0’

// We can reduce cheating by not allowing students from group 1 to sit together, means no two students from group 1 can sit together. Seatings are marked using above conditions. Your task is to give the seating placement of nth possibility Possibility order from 1 to 10 is given below

// [1 10 100 101 1000 1001 1010 10000 10001 10010]
// Input Format

// 'N' : Number of Test cases.
// Followed by N - lines for interger input 'X' :
// Constraints

// 1 <= N 1000
// 50 <= X 1000000
// Output Format

// Print the Xth combunation in the series for each 'X', Seperated by new Line.

// Sample Input 0

// 3
// 4
// 6
// 2
// Sample Output 0

// 101
// 1001
// 10


import java.util.Scanner;

public class SeatingArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // Number of test cases
        int[] positions = {1, 10, 100, 101, 1000, 1001, 1010, 10000, 10001, 10010}; // Given sequence
        
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            System.out.println(generateCombination(X));
        }
        
        sc.close();
    }

    private static String generateCombination(int X) {
        // Generate the sequence dynamically
        StringBuilder result = new StringBuilder();
        int count = 0, num = 1;
        
        while (count < X) {
            if (isValid(num)) {
                count++;
                if (count == X) {
                    result.append(Integer.toBinaryString(num));
                    break;
                }
            }
            num++;
        }
        return result.toString();
    }

    private static boolean isValid(int num) {
        String binary = Integer.toBinaryString(num);
        return !binary.contains("11"); // Ensuring no consecutive '1's
    }
}
