public class Date {
    private int month;
    private int day;

    // Array to store the number of days in each month
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Constructor
    public Date(int m, int d) {
        this.month = m;
        this.day = d;
    }

    // Returns the number of days in the month stored by your date object
    public int daysInMonth() {
        return DAYS_IN_MONTH[month - 1];
    }

    // Returns the day
    public int getDay() {
        return day;
    }

    // Returns the month
    public int getMonth() {
        return month;
    }

    // Advances the Date to the next day, wrapping to the next month and/or year if necessary
    public void nextDay() {
        day++;
        if (day > daysInMonth()) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
            }
        }
    }

    // Returns a string representation of the date
    @Override
    public String toString() {
        return month + "/" + day;
    }

    // Returns the absolute day of a particular date
    public int absoluteDay() {
        int absDay = day;
        for (int i = 0; i < month - 1; i++) {
            absDay += DAYS_IN_MONTH[i];
        }
        return absDay;
    }

    public static void main(String[] args) {
        Date date = new Date(6, 27);
        System.out.println(date); // Output: 6/27
        System.out.println("Days in month: " + date.daysInMonth()); // Output: 30
        System.out.println("Absolute day: " + date.absoluteDay()); // Output: 178

        date.nextDay();
        System.out.println(date); // Output: 6/28
    }
}
