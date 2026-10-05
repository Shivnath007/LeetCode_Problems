package Arrays;

public class CorporateFlightBooking {

    public int[] corpFlightBooking(int[][] bookings, int n) {
        int[] seatChanges = new int[n];
        for(int i = 0; i < bookings.length; i++) {
            int firstFlight = bookings[i][0] - 1;
            int lastFlight = bookings[i][1] - 1;
            int seatBooked = bookings[i][2];
            seatChanges[firstFlight] += seatBooked;
            if(lastFlight + 1 < n) {
                seatChanges[lastFlight + 1] -= seatBooked;
            }
        }
        for(int i = 1; i < n; i++) {
            seatChanges[i] += seatChanges[i - 1];
        }
        return seatChanges;
    }

    public static void main(String[] args) {
        CorporateFlightBooking solution = new CorporateFlightBooking();
        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int n = 5;
        int[] result = solution.corpFlightBooking(bookings, n);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}