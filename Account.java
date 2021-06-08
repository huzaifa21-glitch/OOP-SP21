import java.io.*;
import java.util.ArrayList;

public class Account implements Serializable {
    private String AccNo;
    private int balance;

    public Account(String AccNo, int balance){
        this.AccNo=AccNo;
        this.balance=balance;
    }

    public void setAccNo(String accNo) {
        AccNo = accNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccNo() {
        return AccNo;
    }

    public void withdraw(int money){
        balance -=money;
        System.out.println("Money Withdrawn: "+money+"\nCurrent Balance: "+balance);
        System.out.println("--------------------------------------------");



    }
    public void deposit(int money){
        balance +=money;
        System.out.println("Money Deposited: "+money);
        System.out.println("Current Balance:" + money);
        System.out.println("--------------------------------------------");
    }

    public void transfer(Account to, Account from, int money){
        to.setBalance(money+balance);
        from.setBalance(money-balance);
        System.out.println(money+" transferred successfully.");

    }
    public void BalanceInquiry(){
        System.out.println("Current Balance: "+getBalance());
        System.out.println("--------------------------------------------");
    }

    @Override
    public String toString() {
        return "Account Number: "+AccNo+"\nBalance: "+balance;
    }
    public static void writeFile(ArrayList<Account> record) {
        FileOutputStream bookStream;
        try {



            bookStream = new FileOutputStream("Account.txt");
            ObjectOutputStream objectStream = new ObjectOutputStream(bookStream);
            objectStream.writeObject(record.toString());
            objectStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(ArrayList<Account> record) {

        try {



            FileInputStream inputStream = new FileInputStream("Account.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            System.out.println(objectInputStream.readObject());

            objectInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

