import java.util.Scanner;

public class ATM_interface {
    int bal = 0;

    public static void main(String args[]){
        ATM_interface ui = new ATM_interface();
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while(true){
            System.out.println("\nWlcome to the ATM");
            System.out.println("Choose an option from below");
            System.out.println("\t1.Deposit\n\t2.Withdraw\n\t3.Check Balance\n\t4.Exit");
            x = sc.nextInt();
            if(x==1){
                System.out.println("Enter the amount you want to deposit:");
                int amount = sc.nextInt();
                ui.deposit(amount);
            }
            else if(x==2){
                System.out.println("Enter the amount you want to withdraw");
                int amount = sc.nextInt();
                ui.withdraw(amount);
            }
            else if(x==3){
                ui.checkBalance();
            }
            else if(x==4){
                break;
            }
        }

    }
    public void withdraw(int amount){
        if(bal<amount){
            System.out.println("Insufficient balance in your account.");
        }
        else{
            bal-=amount;
            System.out.println(amount + " Withdrawn");
        }
    }
    public void deposit(int amount){
        bal+=amount;
        System.out.println(amount + " Deposited successfully");
    } 
    public void checkBalance(){
        System.out.println("Your account balance is: " + bal);
    }
}
