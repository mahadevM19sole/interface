import java.util.*;
interface I1
{
   I2 m1();

}
interface I2
 {
   I m2();
 }
class A implements I1
{
   public  I2 m1()
   {
       B b=new B();
       I2 i2=b;
       return i2;
    }
}

class B implements I2
{
  public I m2()
  {
      C c=new C();
      I i=c;
      return i;
   }
}
class Dm
{
 public static I1 getCon()
  {
     A a=new A();
     I1 i=a;
     return i;
   }
}
interface I
 {
     ArrayList<String> m3();
  }
class C implements I
 {
      public ArrayList<String> m3()
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter first string for arraylist=");
           String s1=sc.nextLine();
           System.out.println("enter second string for arraylist=");
           String s2=sc.nextLine();
           System.out.println("enter third string for arraylist=");
           String s3=sc.nextLine();
           System.out.println("enter fourth string for arraylist=");
           String s4=sc.nextLine();
          ArrayList al=new ArrayList();
           al.add(s1);
          return al;

      }
}
          
class TestDemo
{
   public static void main(String args[])
   {
        I1 i=Dm.getCon();  
        I2 i2=i.m1();
        I i4=i2.m2();
        ArrayList<String> w=i4.m3();
        System.out.println(w);
     }
}
   