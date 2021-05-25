import java.util.Scanner;
public class ATM{
    private double balance;
    private int pin;
    public ATM(double b, int p){
        balance = b;
        pin = p;
    }
     
    public void withdrawal(int amt){
        if (balance>= amt){
           balance -= amt;
           System.out.println("Do you want reciept at the End?\n1.Yes\n2.No");
           Scanner sc = new Scanner(System.in);
           int choose = sc.nextInt();
           System.out.println("Transaction Successful");
           if (choose == 1) {
           	System.out.println("Withdrawal Amount - "+amt+"\nCurrent Balance - "+balance);
           }
           System.out.println("Thankyou!! Visit Again");
       }
       else{
           System.out.println("Insufficient Balance");
       }
    }

  public void checkBalance(){
      System.out.println("Balance : "+balance);
      System.out.println("Thankyou!! Visit Again");
  }

  public void changePin(int newPin){
      pin = newPin;
      System.out.println("Pin changed Successfully!\nThankyou!! Visit Again");
  }

    public static void main(String []args){
      System.out.println("Welcome to ATM");
      System.out.println("Enter your PIN : ");
      Scanner sc = new Scanner(System.in);
      ATM obj = new ATM(5000.00,1234);
      int p = sc.nextInt();
      if (p == obj.pin) { 
      	System.out.println("Select an option (1,2,3) : ");
      	System.out.println("1. Withdrawal\n2. Check Balance\n3. Change Pin");
      	int n = sc.nextInt();
      	if (n == 1){
      	  System.out.println("Enter the amount to be withdrawal: ");
          int a = sc.nextInt();
          obj.withdrawal(a);
        }
        else if(n==2){
           obj.checkBalance();
        }
        else if(n==3){  
           System.out.println("Enter new Pin number: ");
           int newPin = sc.nextInt();
           obj.changePin(newPin);
        }
      }

      else{
      	System.out.println("Invalid Pin");
      	System.out.println("Try Again!");
      } 
  }
}