import java.lang.reflect.Array;		// magic :)

public class DequeDemo {
	static void basics(Deque<Object> deque) {
		System.out.println("=== Deque Demo ===");
		System.out.println("=== Basics");
		System.out.println("--- Initial (empty) container");
		System.out.println("--- toString");
		System.out.println(deque);

		System.out.println("--- Some adds");
		System.out.print("addFirst(\"Hello\")");
		deque.addFirst("Hello");
		System.out.println(" -> " + deque);
		System.out.print("addLast(14)");
		deque.addLast(14);
		System.out.println(" -> " + deque);
		System.out.print("addFirst(true)");
		deque.addFirst(true);
		System.out.println(" -> " + deque);
		System.out.print("addLast(12.5)");
		deque.addLast(12.5);
		System.out.println(" -> " + deque);

		
		System.out.println("--- Removes till empty");
		boolean toggle = false;
		while (!deque.isEmpty()) {
			Object value = toggle ? deque.removeFirst() : deque.removeLast();
			System.out.println("Removed: " + value + " deque: " +deque);
			toggle = !toggle;
		}
	}

	static void capacityManagement(Deque<Object> deque) {
		System.out.println();
		System.out.println("=== Capacity Management ===");
		System.out.println("--- Initial (empty) container");
		System.out.println(deque);

		System.out.println("Adding 4 times initial capacity elements + 1");
		int initialCapacity = deque.capacity();
		for (int i = 1; i <= 4 * initialCapacity+1; i++) {
			int lastCapacity = deque.capacity();
			System.out.print("Adding " + i);
			deque.addLast(i);
			System.out.println(" -> " + deque);
			if (lastCapacity != deque.capacity()) {
				System.out.println("(dequeue was resized to: " + deque.capacity() + ")");
				lastCapacity = deque.capacity();
			}
		}
	}		

	static void exceptionHandling(Deque<Object> deque) {
		System.out.println();
		System.out.println("=== Exception Handling  various erroneous operations will now be attempted ===");
		System.out.println("--- Initial (empty) container");
		System.out.println(deque);

		try {
			System.out.print("removeFirst() ... ");
			deque.removeFirst();
			exceptionError();
		} catch (CollectionException e) {
			System.out.println(" exception was thrown");
		}

		try {
			System.out.print("removeLast() ... ");
			deque.removeLast();
			exceptionError();
		} catch (CollectionException e) {
			System.out.println(" exception was thrown");
		}
	}

	static void exceptionError() {
		System.out.println("*** Error *** Expected CollectionException error not thrown");
		System.exit(1);
	}

	static void generics(Deque<Integer> integerDeque, Deque<String> stringDeque) {
		System.out.println();
		System.out.println("=== Integer element type");
		Integer [] integerArray = {10, 20, 30, 40, 50};
		testInstantiatedGeneric(integerDeque, integerArray);

		System.out.println(); 

		System.out.println("=== String element type");
		String [] stringArray = {"First", "Second", "Third"};
		testInstantiatedGeneric(stringDeque, stringArray);

		System.out.println(); 
	}

	static private <E> void testInstantiatedGeneric(Deque<E> deque, E [] array) {
		System.out.println("--- Sequential insertions (append) and toString"); 
		for (var e : array) {
			System.out.println("Inserting " + e + " at " + deque.size());
			deque.addLast(e);
		}
		System.out.println(deque);

		System.out.println(); 

		while (!deque.isEmpty()) {
			E value = deque.removeFirst();
			System.out.println("Removed: " + value + " deque: " +deque);
		}
	}
}
		

