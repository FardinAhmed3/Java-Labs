package DependencyInjection;

public class WeatherAlertApp {
	WeatherAlert alert;
	
	public WeatherAlertApp(WeatherAlert alert) {
		this.alert=alert;
	}
	public void processAlert(String message) {
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherAlert alert=new WeatherService();
		WeatherAlertApp app=new WeatherAlertApp (alert);
		app.processAlert("Dependancy, Injected");
		
	}

}
