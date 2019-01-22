package demo2;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0; i<10 ; i++)
			a.add(i);
		System.out.println(a);
		Iterator<Integer> i = a.iterator();
		while(i.hasNext()) {
			int n = (Integer) i.next();
			System.out.print(n+" ");
			if(n%2!=0)
				i.remove();
		}
		System.out.println("\n"+a);
		//dryjedy
	}
}
