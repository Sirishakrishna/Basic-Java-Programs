class A
{
 final void show()
  {
   System.out.println("show() is final method");
  }
}

 class B extends A
  {
    void show()
     {
       System.out.println("show() cant be overridden");
      }
}

   class FinalClassDemo{
     public static void main(String arg[])
       {
         B ob=new B();
         ob.show();
        }
}