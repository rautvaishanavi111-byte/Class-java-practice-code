//obaject as a paeameter
class bank_account {
    String accountholsername;
    double balance;
    void transfer( bank_account receiver , double balance){
        double amount =0;
if (balance>= amount){
balance = balance - amount;
receiver.balance = receiver.balance + amount;
}
public class main {
 public static void main(String[] args){
   bank_account a1 = new bank_account();
   bank_account a2 = new bank_account();
   a1.balance=20000;
   a2.balance=15000;
    a1.transfer(a2, 5000);

        System.out.println("A1 Balance: " + a1.balance);
        System.out.println("A2 Balance: " + a2.balance);
 }
}
    }
}

