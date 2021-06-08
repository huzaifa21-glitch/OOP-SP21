import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab14Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] account = new Account[10];
        account[0] = new Account("00000000", 3435);
        account[1] = new Account("11111111", 865463);
        account[2] = new Account("22222222", 5633);
        account[3] = new Account("33333333", 123124);
        account[4] = new Account("43453434", 70086);
        account[5] = new Account("46969678", 2225);
        account[6] = new Account("87789654", 7834665);
        account[7] = new Account("43342768", 75);
        account[8] = new Account("06895324", 977);
        account[9] = new Account("65775622", 7456);

        ArrayList<Account> Records = new ArrayList<Account>();
        Records.add(account[0]);
        Records.add(account[1]);
        Records.add(account[2]);
        Records.add(account[3]);
        Records.add(account[4]);
        Records.add(account[5]);
        Records.add(account[6]);
        Records.add(account[7]);
        Records.add(account[8]);
        Records.add(account[9]);

        Account.writeFile(Records);

        System.out.println("Enter the amount to deposit:");
        int n = input.nextInt();

        account[1].deposit(n);

        account[3].BalanceInquiry();
        System.out.println("Enter amount to withdraw: ");
        int w = input.nextInt();
        account[2].withdraw(w);
        System.out.println("Enter the amount to transfer: ");
        int t = input.nextInt();
        account[8].transfer(account[9],account[8],t);

        account[8].BalanceInquiry();

        Account.writeFile(Records);
//        Account.readFile(Records);



    }
}
