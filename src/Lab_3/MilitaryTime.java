public class MilitaryTime implements Time {
    private int hours; 
    private int minutes; 

    public MilitaryTime(String timeStr) {
        set(timeStr);
    }

    public void set(String timeStr) {
        int hour = Integer.parseInt(timeStr.substring(0, 2));
        int minute = Integer.parseInt(timeStr.substring(3, 5));
        String amPm = timeStr.substring(5).toLowerCase();

        if ("pm".equals(amPm) && hour != 12) {
            hour += 12;
        } else if ("am".equals(amPm) && hour == 12) {
            hour = 0;
        }

        this.hours = hour;
        this.minutes = minute;
    }

    public int get12Hour() {
        if (hours == 0 || hours == 12) return 12;
        return hours % 12;
    }

    public int get24Hour() {
        return hours;
    }

    public int getMinute() {
        return minutes;
    }

    public void tick() {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours++;
            if (hours == 24) hours = 0;
        }
    }

    public String toString() {
        String amPm = hours < 12 ? "am" : "pm";
        int displayHour = get12Hour();
        return String.format("%02d:%02d%s", displayHour, minutes, amPm);
    }
}