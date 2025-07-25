package new_interface_features2;

interface Lamda {
	
	 int myFunction(int val1,int val2,int val3);

}
class Main{
	public static void main(String[] args) {
		
		Lamda t1=(a,b,c) ->a+b+c;
		Lamda t2=(a,b,c) -> a*b*c;
		int x=2,y=6,z=5;
		
		System.out.println("Sum: " + t1.myFunction(x, y, z));          // Output: 9
        System.out.println("Product: " + t2.myFunction(x, y, z)); 
	}
}