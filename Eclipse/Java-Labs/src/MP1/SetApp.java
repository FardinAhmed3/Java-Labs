package MP1;

public class SetApp {

	public static void main(String[] args) {
		System.out.println("SetApp");
		Set set= new Set(15);
		for(int i=0;i<75;i+=5)
			set.add(i);
		
		System.out.println("set 1 -> "+set+" "+set.isEmpty());
		
		

	}

}
