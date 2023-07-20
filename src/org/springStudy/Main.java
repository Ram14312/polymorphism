package org.springStudy;

import org.springStudy.phone.Mi;
import org.springStudy.phone.Phone;
import org.springStudy.phone.Vivo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Phone p = new Phone("nokia");
//		System.out.println(p.getModel());
//		p.features();
//		
//		Mi m = new Mi("Mi") ;
//		System.out.println(m.getModel());
//		m.features();
//		
//		Vivo v = new Vivo("vivo");
//		System.out.println(v.getModel());
//		v.features();
		
		Phone mi = new Main().phone(1);
		System.out.println(mi.getModel());
		mi.features();
		
		Phone vivo = new Main().phone(2);
		System.out.println(vivo.getModel());
		vivo.features();
			

	}
	
	public Phone phone(int driver) {
		switch(driver) {
		case 1: return new Mi("mi");
		case 2: return new Vivo("vivo");
		}
		return null;
	}

}
