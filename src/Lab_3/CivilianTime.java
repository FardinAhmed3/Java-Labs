public class CivilianTime implements Time {
    private int hours;
    private int minutes; 
    private String ampm;
    
    public CivilianTime(String timeStr) {
        set(timeStr);
    }
    
    public void set(String timeStr) {
        String[] parts = timeStr.split("[:]");
        hours = Integer.parseInt(parts[0]);
        minutes = Integer.parseInt(parts[1].substring(0, 2));
        ampm = parts[1].substring(2).toLowerCase();
    }
    
    public int get12Hour() {
        return hours;
    }
    
    public int get24Hour() {
        if ("pm".equals(ampm) && hours < 12) {
            return hours + 12;
        } else if ("am".equals(ampm) && hours == 12) {
            return 0;
        }
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
            if (hours == 12) {
                ampm = "pm".equals(ampm) ? "am" : "pm";
            } else if (hours == 13) {
                hours = 1;
            }
        }
    }
    
    public String toString() {
        return String.format("%02d:%02d%s", hours, minutes, ampm);
    }
}