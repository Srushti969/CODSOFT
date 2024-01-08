import java.util.*;

public class at {
    long acc_no;
    long bal;
    Scanner sc = new Scanner(System.in);

    void create() {
        System.out.println("Enter account number:");
        acc_no = sc.nextLong();
        System.out.println("Enter the account balance:");
        bal = sc.nextLong();
    }

    void display() {
        System.out.println("Account Number : " + acc_no + "\nBalance : " + bal);
    }

    void deposit() {
        long deposit;
        System.out.println("\nDeposit Amount : ");
        deposit = sc.nextLong();
        bal = bal + deposit;
        System.out.println("Current Balance=" + bal);

    }

    void withdraw() {
        long wd = 0;
        System.out.println("Enter the amount to be withdrawn");
        wd = sc.nextLong();
        if (wd <= 2000) {
            bal = bal - wd;
            System.out.println("Your balance after withdrawal is" + bal);

        } else {
            System.out.println("Sorry, you cannot withdraw more than 2000 in a single transaction.");
        }
    }

    void balance() {
        System.out.println("Your current balance is" + bal);
    }

    boolean search(long acno) {
        if (acc_no == acno) {
            return (true);
        } else {
            return (false);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of account holders:");
        int n = sc.nextInt();
        int i;
        at a[] = new at[n];
        for (i = 0; i < n; i++) {
            a[i] = new at();
            a[i].create();
        }
        int ch;
        do {
            System.out.println("Enter your Choice:\n1.Deposit Money\n2.Withdraw Money\n3.Check balance\n4.Exit");
            ch = sc.nextInt();
            long acno;
            switch (ch) {
                case 1:
                    System.out.println("Enter acc no:");
                    acno = sc.nextInt();
                    boolean found = false;
                    for (i = 0; i < n; i++) {
                        found = a[i].search(acno);
                        if (found) {
                            a[i].deposit();
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Account not found");
                    break;
                case 2:
                    System.out.println("Enter acc no:");
                    acno = sc.nextInt();
                    found = false;
                    for (i = 0; i < n; i++) {
                        found = a[i].search(acno);
                        if (found) {
                            a[i].withdraw();
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Account not found");
                    break;
                case 3:
                    System.out.println("Enter acc no:");
                    acno = sc.nextInt();
                    found = false;
                    for (i = 0; i < n; i++) {
                        found = a[i].search(acno);
                        if (found) {
                            a[i].balance();
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Account not found");
                    break;
                case 4:
                    break;

            }
        } while (ch != 4);
        sc.close();

    }

}
