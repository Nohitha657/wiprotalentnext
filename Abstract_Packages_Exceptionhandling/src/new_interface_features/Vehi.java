package new_interface_features;

interface Vehi {
	default void message() {
		System.out.println("Inside Vehicle");
	}

}
interface FourWheeler{
	default void message() {
		System.out.println("Inside FourWheeler");
	}
	
}
class Car implements Vehi,FourWheeler{
	public static void main(String[] args) {
    
		Car myCar = new Car();
        myCar.message(); 

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		Vehi.super.message();
	}
	
	
}
