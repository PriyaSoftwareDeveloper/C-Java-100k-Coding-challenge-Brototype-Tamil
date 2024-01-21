
public class Sample {

		int a = 100;
		int b = 200;
		
		Sample(int a, int b){
			
			a = this.a;
			System.out.println(a + " " + b);
			
//			this.a = a; //this.a->global variable a->local variable
//			System.out.println("this.a " + a);
			
			
		}
}
