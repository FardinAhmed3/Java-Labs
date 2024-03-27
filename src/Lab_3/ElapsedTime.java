//Lab 3.3

public class ElapsedTime implements Time {
    private int elapsedTime; 
    
    public ElapsedTime(String timeStr) {
        set(timeStr);
    }
    
    public void set(String timeStr) {
        String[] parts = timeStr.split("[:]");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1].substring(0,2));
        String ampm = parts[1].substring(2).toLowerCase();
        
        if("pm".equals(ampm) && hours != 12)
        hours += 12;
        else if("am".equals(ampm) && hours == 12)
        hours = 0;
        
        this.elapsedTime = hours * 60 + minutes;
    }
    
    public int get12Hour() {
        int hour = (elapsedTime / 60) % 12;
        return hour == 0 ? 12 : hour; 
    }
    
    public int get24Hour() {
        return elapsedTime / 60; 
    }
    
    public int getMinute() {
        return elapsedTime % 60;
    }
    
    public void tick() {
        elapsedTime = (elapsedTime + 1) % (24 * 60); 
    }
    
    public String toString() {
        String ampm = get24Hour() < 12 ? "am" : "pm";
        return String.format("%02d:%02d%s", get12Hour(), getMinute(),ampm );
    }
}