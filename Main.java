import java.lang.Math;
import java.util.*;


//METRO CARD CREATION
//MCN = METRO CARD NUMBER
//NAME = CUSTOMER NAME
//AGE = CUSTOMER AGE
//CARD BALANCE = DEFAULT 50
 class MetroCard{
     int mcn;
     String name;
     int age;
     double bal = 50;
     public MetroCard(int mcn,String name,int age){
         this.mcn = mcn;
         this.name = name;
         this.age = age;
     }
     //public void detail()
     //{
       // System.out.println(mcn);

     //}

 }

class Reg extends MetroCard
{
    public Reg(int mcn,String name,int age){
        super(mcn,name,age);
    }

}


class Main{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int cno = (int)(Math.random()*99999);
        System.out.println("Your card Number is "+cno);
        System.out.print("Enter your Name: ");
        String name = s.next();
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        // System.out.println(age);
        //System.out.println(name);
        //System.out.println(cno);
        Reg u1 = new Reg(cno,name,age);
        //u1.detail();
    }


}
