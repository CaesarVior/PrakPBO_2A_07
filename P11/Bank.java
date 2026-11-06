import java.util.LinkedHashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new LinkedHashMap<>();
    private AccountRepository repository;

    public Bank(AccountRepository repository) {
        this.repository = repository;
    }

    public boolean addAccount(Account account) {
        if (repository.findByNumber(account.getAccountNumber()) != null) {
            System.out.println("Account creation failed: "
                    + account.getAccountNumber() + " already exists");
            return false;
        }
        accounts.put(account.getAccountNumber(), account);
        repository.save(account);
        return true;
    }

    public Account findAccount(String accountNumber) {
        return repository.findByNumber(accountNumber);
    }

    public void printAllAccounts() {
        for (Account acc : repository.findAll()) {
            acc.printInfo();
        }
    }

    public void printMonthlyFees() {
        for (Account acc : accounts.values()) {
            System.out.println(acc.getAccountNumber() + " fee " + acc.monthlyFee());
        }
    }

    public void processMonthEnd() {
        for (Account acc : accounts.values()) {
            if (acc instanceof InterestBearing bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + " interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }

    public void printHistory(String accountNumber) {
        Account acc = findAccount(accountNumber);
        if (acc == null) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        for (Transaction t : acc.getHistory()) {
            System.out.println(accountNumber + " " + t);
        }
    }
}
