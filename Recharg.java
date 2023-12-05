import java.util.*;
class Recharg {
    public static void main(String[] args) {
        Options u1 = new Options();
        u1.recharge();
//        u1.checkBal();
    }
}

class Options extends CDetails
{
    public void recharge(){
        Scanner sc= new Scanner(System.in);
        boolean opt;
        double amt;
        do{
            System.out.print("Enter the amount: ");
            amt = sc.nextDouble();
            double fee = 0.02*amt;
            double total = amt+fee;
            System.out.println("Amount: "+amt+"\nPlatform Fee: "+fee+"\nTotal: "+total);
            System.out.println("Press 1 to confirm,Press 0 to cancel");
            opt = sc.next().charAt(0) =='1'?true:false;
            if(opt){
                this.bal += amt+amt*0.02;
                System.out.println("Press 1 to repeat,Press 0 to Main Menu");
            }else {
                System.out.println("Press 1 to Retry,Press 0 to Main Menu");
            }
            opt = sc.next().charAt(0) =='1'?true:false;
        }while(opt);
        System.out.println("Current Balance is : "+this.bal);

    }

    public void checkBal(){
        System.out.println("Your Balance is: "+this.bal);

    }
}

class CDetails
{
    String cname = "Akshay";
    double bal = 50;
}