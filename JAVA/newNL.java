import java.util.HashSet;
public class newNL {

	public static void main(String[] args) {
		HashSet<String> s=new HashSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");

		System.out.println(s);
		s.remove("d");
		System.out.println(s);
		if(s.contains("apple")){
			System.out.println("Apple is present in the hash set");
		}
		else{
			System.out.println("Apple is not present in the set ");
		}	
	}

}
