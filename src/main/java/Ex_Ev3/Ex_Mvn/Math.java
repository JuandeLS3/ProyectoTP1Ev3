package Ex_Ev3.Ex_Mvn;
public class Math {
	int a,b;
	Math(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int add() {
		return a+b;
	}
	public static void main (String[] args){
		Math m= new Math(2,2);	
	}
}
