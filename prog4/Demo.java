interface Area
{
 float pi=3.14f;
 float compute(float x,float y);
}

 class rectangle implements Area
 {
    public float compute(float x,float y)
     {
       return x*y;
     }
}

class circle implements Area
{
 public float compute(float x,float y)
{
 return pi*x*y;
}
}
   
 class Demo{
       public static void main(String arg[])
         {
           rectangle r=new rectangle();
           System.out.println(r.compute(2,4));
           circle c=new circle();
           System.out.println(c.compute(1,1));
}
}