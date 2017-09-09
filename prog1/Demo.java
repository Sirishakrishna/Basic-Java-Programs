/*java program that demonstrates on Method overriding*/
class One {
          int a,b;
          void display() {
                   System.out.println("display() of class One.");
                   System.out.println("a is"+a+"b is "+b);
               }
}
//creating subclass to class One
class Two extends One {
           int c;
           //overriding the method display()
           void display() {
                    super.display();
                   System.out.println("display() of class Two.");
                   System.out.println("c is "+c);
                 }
}
class Demo  {
         public static void main(String arg[]) {
                      Two t=new Two();
                       t.a=10;
                       t.b=20;
                       t.c=30;
                       t.display();
                   }
}
