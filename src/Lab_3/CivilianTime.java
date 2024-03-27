public class CivilianTime implements Time {
    private int hours; // 1-12
    private int minutes; // 0-59
    private String amPm; // AM or PM

    @Override
    public void set(String timeStr) {
        // Expected format: "HH:MM AM" or "HH:MM PM"
        String[] parts = timeStr.split("[ :]+");
        this.hours = Integer.parseInt(parts[0]);
        this.minutes = Integer.parseInt(parts[1]);
        this.amPm = parts[2];
    }

    @Override
    public int get12Hour() {
        return this.hours;
    }

    @Override
    public int get24Hour() {
        return this.amPm.equals("AM") ? this.hours : (this.hours % 12) + 12;
    }

    @Override
    public int getMinute() {
        return this.minutes;
    }

    @Override
    public void tick() {
        this.minutes++;
        if (this.minutes >= 60) {
            this.minutes = 0;
            this.hours++;
            if (this.hours > 12) {
                this.hours = 1;
                this.amPm = this.amPm.equals("AM") ? "PM" : "AM";
            }
        }
    }
}