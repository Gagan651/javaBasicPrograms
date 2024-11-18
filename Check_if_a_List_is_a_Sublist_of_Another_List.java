package Collection;

import java.util.ArrayList;

public class Check_if_a_List_is_a_Sublist_of_Another_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		ArrayList b=new ArrayList();
		ArrayList c=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
		c.addAll(b);
		c.retainAll(a);
		System.out.println(a.equals(c));
		
		
		
	
		

	}

}
