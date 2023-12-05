import java.util.Scanner;

class Run {

    static Scanner sc = new Scanner(System.in);
    static int bal;

    static void recharge() {
        System.out.println("enter the amount to recharge");
        bal += sc.nextInt();
    }

    static void checkBal() {
        System.out.println("your balance is : " + bal);
    }

    static boolean run() {
        System.out.println("-------------entering into the railway station-------------\n\n");

        boolean cont = true;
        while (cont) {
            System.out.println("choose your option\n 1) Reacharge your card\n 2) check your balance\n 3) Exit\n ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    recharge();
                    break;
                case 2:
                    checkBal();
                    break;
                case 3:
                    return true;
                default:
                    System.out.println("enter a valid choice");
            }

            System.out.println(" To choose again,  press 1");
            cont = sc.next().charAt(0) == '1' ? true : false;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean exitNow = false;
        exitNow = run();

        if (exitNow == true) {
            return;
        } else {
            System.out.println();
        }
        // code Incomplete............
    }
}

// Passenger class is not yet used

class Passenger {
    String name;
    int age;
    int bal;

    public Passenger(String name, int age, int bal) {
        this.name = name;
        this.age = age;
        this.bal = bal;
    }
}