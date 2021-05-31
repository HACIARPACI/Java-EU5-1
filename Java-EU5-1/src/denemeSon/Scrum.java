package denemeSon;

import java.util.ArrayList;
import java.util.Arrays;

public class Scrum {
	
	public String PO,BA,SDET;
	
	
	public Scrum(String pO, String bA, String sDET) {
		PO = pO;
		BA = bA;
		SDET = sDET;
	}

	ArrayList<Test>test= new ArrayList<>();
	ArrayList<Develo>devo=new ArrayList<>();
	
	public void addTester(Test tester) {
		this.test.add(tester);
		
	}
	public void addTester(Test[]testers) {
		this.test.addAll(test);
	}
	
	public void addDevelo(Develo devos) {
		this.devo.add(devos);
	}
	public void addDevelo(Develo[]devos) {
		this.devo.addAll(devo);
		
		
		
		
	}
	public String toString() {
		return "Scrum [PO=" + PO + ", BA=" + BA + ", SDET=" + SDET + ", test=" + test + ", devo=" + devo
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public void removeDev(int id) {
		
		devo.removeIf(p->p.employeeId==id);
		
		
	}
	
	

}
