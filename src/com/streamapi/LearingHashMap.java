package com.streamapi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LearingHashMap {

	public static void main(String[] args) {

		HashMap m = new HashMap();
		
		m.put("Chiranjeevi", 700);
		m.put("balaiah", 800);
		m.put("Venkatesh", 200);
		m.put("nagarjuna", 500);
		System.out.println(m); // {K=V,K=V,...}
		// output: {balaiah=800, nagarjuna=500, Chiranjeevi=700, Venkatesh=200}
		
		System.out.println(m.put("Chiranjeevi", 1000));
		//output: 700
		
		Set s = m.keySet();
		System.out.println(s); // [k,k,...]
		// output: [balaiah, nagarjuna, Chiranjeevi, Venkatesh]
		
		Collection c = m.values();
		System.out.println(c);
		// output: [800, 500, 1000, 200]
		
		Set s1 = m.entrySet();
		System.out.println(s1);
		//output: [balaiah=800, nagarjuna=500, Chiranjeevi=1000, Venkatesh=200]
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+ "...."+m1.getValue());
			/* output:  balaiah....800
						nagarjuna....500
						Chiranjeevi....1000
						Venkatesh....200  */
			if(m1.getKey().equals("nagarjuna")) {
				m1.setValue(10000);
			}
		}
		System.out.println(m);
		// {balaiah=800, nagarjuna=10000, Chiranjeevi=1000, Venkatesh=200
	}

}
