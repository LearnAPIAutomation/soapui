package log4j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorEx {

	public static void main(String[] args) {

		Map map = new HashMap<>();
		map.put(101, "A");
		map.put(102, "B");
		map.put(103, "C");

		Set ss = map.entrySet();

		Iterator i = ss.iterator();

		while (i.hasNext()) {

			Map.Entry me= (Map.Entry)i.next();
			if(me.getValue().equals("A"))
			{
				me.setValue("Hello");
			}
			System.out.println(me.getValue());
		}

	}

}
