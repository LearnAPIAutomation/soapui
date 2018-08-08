import java.util.HashMap;
import java.util.Set;

public class duplicate {
	public static void main(String[] args) {

		String ss = "hi there How are you";
		String s1 = ss.toLowerCase().replaceAll(" ", "");
		HashMap<Character, Integer> map = new HashMap();

		for (int i = 0; i < s1.length(); i++) {

			if (!map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), 1);
			}
			else
			{
				map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
			}
		}
		
		Set<Character> set= map.keySet();
		
	for (Character cc : set) {
		if(map.get(cc)>1)
		{
		System.out.println(cc+":"+map.get(cc));	
		}
		
	}

	}

}