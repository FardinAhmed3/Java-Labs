package Sample;

public class SetApp {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Set set=new Set(10);

		for (int i=0;i<=100;i++) {
			set.addv2(i);}
		System.out.println(set);
		System.out.println(set.getSize());

		System.out.println(set.contains(10));
		System.out.println(set.getCapacity());
		set.set(0, 100);
		System.out.println(set);
		set.set(134, 40);
	}
}
		
		
