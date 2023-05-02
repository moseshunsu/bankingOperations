public class AccountTests {

    public static void main(String[] args) {
        Account accountMoses = new Account();
        Account accountRidoh = new Account();

        long accountMosesNumber = accountMoses.getAccountNumber();
        long accountRidohNumber = accountRidoh.getAccountNumber();
        System.out.println(accountMosesNumber);
        System.out.println(accountRidohNumber);

        accountMoses.increaseBalance(10000);
        accountRidoh.reduceBalance(500);

        System.out.println(accountMoses.getAccountBalance());
        System.out.println(accountRidoh.getAccountBalance());
    }
}
