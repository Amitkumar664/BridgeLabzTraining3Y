public class CinemaHall {
      public static void main(String[] args) {
        int rows = 5, cols = 10;
        int[][] seats = new int[rows][cols]; // 0 = empty, 1 = booked

        // Example: booking for 3 families
        bookFamily(seats, 3);
        bookFamily(seats, 3);
        bookFamily(seats, 3);
        bookFamily(seats, 3);
        bookFamily(seats, 3);
    }

    public static void bookFamily(int[][] seats, int familySize) {
        boolean booked = false;

        for (int i = 0; i < seats.length; i++) { // each row
            for (int j = 0; j <= seats[i].length - familySize; j++) { // check blocks
                boolean free = true;

                // check if all consecutive seats are empty
                for (int k = 0; k < familySize; k++) {
                    if (seats[i][j + k] == 1) {
                        free = false;
                        break;
                    }
                }

                if (free) {
                    // mark as booked
                    for (int k = 0; k < familySize; k++) {
                        seats[i][j + k] = 1;
                    }
                    System.out.println("Family of " + familySize + " booked at Row " + (i+1) + " starting Seat " + (j+1));
                    booked = true;
                    return; // stop after booking one family
                }
            }
        }

        if (!booked) {
            System.out.println("Not available for family of " + familySize);
        }
    }
}
