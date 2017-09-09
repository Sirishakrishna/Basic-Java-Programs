 //write a java program to demonstrate on method overloading.
	class Overloading {
		void display( ){
			System.out.println("display method of overload class");
		}
		void display(int a){
			System.out.println("display method with one parameter");
			System.out.println(a);
		} 
		void display(int a,int b){
			System.out.println("display method with two parameter");
			System.out.println(a+" "+b);
                        
		}
	} //end of class Overloading..

	class OverloadDemo{
		public static void main (String arg[]){
			Overloading d=new Overloading ( );
			d.display (); // display method of overload class without parameters
			d.display(12); // display method of Overload class with one parameter
			d.display(12,10); // display method of Overload class with two parameters
	 	}
	}
