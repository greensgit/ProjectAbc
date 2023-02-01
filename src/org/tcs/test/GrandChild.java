package org.tcs.test;

public class GrandChild extends Demo{
	
	public void grandChildName() {

		System.out.println("Grandchild");
	}
	
	public static void main(String[] args) {
		
		GrandChild g = new GrandChild();
		g.grandChildName();
		g.empName();
		g.joiningDate();
		g.javaCourse();
		g.trainerName();
	}

}
