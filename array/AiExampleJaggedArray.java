package array;

public class AiExampleJaggedArray {

    public static void main(String[] args) {

        // Jagged array for cinema rows
        int seats[][] = {
            new int[10],  // Row 1 → 10 seats
            new int[8],   // Row 2 → 8 seats
            new int[12]   // Row 3 → 12 seats
        };

       
        // Assign seat numbers
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = j+1;  // Seat numbers start from 1
            }
        }

        // Print the cinema seat layout
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}

