package DependencyInjection;

public class WeatherService implements WeatherAlert {
	public String sendAlert(String message) {
		return "It will rain today"+message;
	}
}
