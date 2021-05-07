package assignment8;

public class q17 {

	public static void main(String[] args) {
		 System.out.println(cola(false,false,3,1,7));

    }

    public static boolean cola(boolean avilable,boolean gift,int ingredient1,int ingredient2,int ingredient3) {
        
        
        if(avilable==true||gift==true||(ingredient1==1&&ingredient2==2&&ingredient3==3)||(ingredient1==3&&ingredient2==1&&ingredient3==2)) {
            
            return true;
            
        }else {
        	return false;}
		
		
		
		
	}

}
