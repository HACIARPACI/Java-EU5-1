package day35encapsulation;

public class RoulettePocket {
	 public int pocketNumber;

	    private String[] pocketColor;

	    
	    private void setpocketColors() {

	        pocketColor = new String[37];

	        pocketColor[0] = "green";

	        for (int i = 1; i <= 10; i++) {

	            if (i % 2 == 0) {
	                pocketColor[i] = "black";
	                pocketColor[i + 18] = "black";
	            } else {
	                pocketColor[i] = "red";
	                pocketColor[i + 18] = "red";
	            }

	        }

	        for (int i = 11; i <= 18; i++) {

	            if (i % 2 == 1) {
	                pocketColor[i] = "black";
	                pocketColor[i + 18] = "black";
	            } else {
	                pocketColor[i] = "red";
	                pocketColor[i + 18] = "red";
	            }

	        }

	    }

	    public RoulettePocket(int a) { //(int a= int pocketNumber)

	        if (a > 36 || a < 0) {
	            System.out.println("Invalid Number");
	            System.exit(0);

	        } else {
	            pocketNumber = a;   //this.pocketNumber = pocketNumber;
	            setpocketColors();
	        }

	    }

	    
	    public String getPocketColor() {

	        return pocketColor[pocketNumber];
	        
	    }        
	        
}

	    
	    
	    