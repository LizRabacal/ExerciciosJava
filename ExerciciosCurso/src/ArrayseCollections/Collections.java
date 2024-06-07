package ArrayseCollections;
import java.util.*;
public class Collections {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
			@SuppressWarnings("rawtypes")
			HashSet conjunto = new HashSet();
			conjunto.add("aaa");
			conjunto.add(950);
			conjunto.add(false);
			conjunto.add(5.8);
			System.out.println(conjunto.size());
			System.out.println(conjunto);

			System.out.println(conjunto.remove(950));
			System.out.println(conjunto.remove(50));
			System.out.println(conjunto.add(5.8));
			
			HashSet conjunt2 = new HashSet();
			conjunt2.add(5.8);
			conjunt2.add(false);
			conjunto.retainAll(conjunt2);
			System.out.println(conjunto);
			


		
	}

}
