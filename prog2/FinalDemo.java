/* java program that uses final keyword before method name */
class One {
	int a;
	final void show () {
		System.out.println ("show () method of class one");
	         }
	}
//creating subclass to one
class Two extends One {
	int b;
	void show () {   
		System.out.println ("overriding is not possible");
	         }
	}

          class FinalDemo
          {
           public static void main(String arg[])
              {
                Two ob=new Two();
                 ob.show();
               }
            }
