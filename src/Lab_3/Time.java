public interface Time {
	void set(String timeStr);
	int get12Hour();
	int get24Hour();
	int getMinute();
	void tick();
}