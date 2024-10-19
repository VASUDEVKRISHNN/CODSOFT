import java.util.Scanner;
class ATM__Machine
{
    float balance=1000000;
    int PIN=2005;
    public void check_pin() {
        System.out.println("Enter Your Pin");
        Scanner scan = new Scanner(System.in);
        int entered_pin;
        entered_pin = scan.nextInt();
        if (entered_pin == PIN) {
            menu();
        } else System.out.println("Enter a valid pin");
    }
        void menu()
        {
           System.out.println("Enter your choice");
            System.out.println("1.ACCOUNT Balance");
            System.out.println("2. Withdrawal Money ");
            System.out.println("3. Deposit money");
            System.out.println("4.Exit");
            Scanner scan=new Scanner(System.in);
                    int opt=scan.nextInt();
            if(opt==1)
            {
                check_balance();
            }
            else if(opt==2)
                {
                    withdrawal_money();
                }
                else if(opt==3)
                {
                    deposit_money();
                }
                else if(opt==4)
                {
                    return;
                }
                else
                {
                    System.out.println("Enter a valid choice");
                }}
                public void check_balance()
            {
                System.out.println("Balance:"+balance);
                menu();
            }
             public void withdrawal_money()
            {
                System.out.println("Enter amount to be withdrawal");
                Scanner scan=new Scanner(System.in);
                float amount=scan.nextFloat();
                if(amount>balance)
                {
                    System.out.println("Insufficient Balance");
                }
                else
                {
                    balance=balance-amount;
                    System.out.println("Amount withdrawal successfully");
                    System.out.println("Your current balance:"+balance);
                }menu();
            }
            void deposit_money()
            {
                System.out.println("Enter amount to be deposit");
                Scanner sc=new Scanner(System.in);
                float amount=sc.nextFloat();
                balance=balance+amount;
                System.out.println("Amount deposit successfully");
                menu();
            }

    public   static void main(String[] args) {
        ATM__Machine obj=new ATM__Machine();
        obj.check_pin();
    }
}