public class Main {

    public static void main(String[] args) {

        Account seanAccount = new Account();
        seanAccount.withdrawl(100.0);

        seanAccount.deposit(50.0);
        seanAccount.withdrawl(100.0);

        seanAccount.deposit(51.0);
        seanAccount.withdrawl(100.0);

    }

}
