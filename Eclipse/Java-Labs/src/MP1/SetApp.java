package MP1;

public class SetApp {

	public static void main(String[] args) {
		System.out.println("SetApp");
		
		Set set= new Set(15);
		
		for(int i=0;i<75;i+=5)
			set.add(i);
		
		System.out.println("set 1 -> "+set+" "+set.isEmpty());
		
		Set setv2=new Set(5);
		//setv2.add();
		System.out.println("Is setv2 empty? Answer is -> "+setv2.isEmpty());
		System.out.println();
		System.out.println("Set capacity and size "+set.getCapacity()+" "+set.getSize());
		
		set.remove(0);
		System.out.println("After removing index 0 "+set.getCapacity()+" "+set.getSize());
		System.out.println();
		System.out.println(set);
		
		set.clear();
		System.out.println(set.getCapacity()+" "+set.getSize());
		System.out.println(set);
		
	}

}
