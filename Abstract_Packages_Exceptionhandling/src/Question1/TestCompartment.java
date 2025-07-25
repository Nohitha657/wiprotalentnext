package Question1;

import java.util.Random;

public class TestCompartment {
	public static void main(String[] args) {
		int[] arr=new int[10];
		Random rand = new Random();
        int n = rand.nextInt(4) + 1;
        
        Compartment comp;
        switch (n) {
        case 1:
            comp = new FirstClass();
            break;
        case 2:
            comp = new Ladies();
            break;
        case 3:
            comp = new General();
            break;
        case 4:
            comp = new Luggage();
            break;
        default:
            comp = null;
    }
    System.out.println("Random Compartment Type (1 to 4): " );
    
    if (comp != null) {
        comp.notice(); 
    } else {
        System.out.println("Invalid Compartment");
    }
    
	}
}
