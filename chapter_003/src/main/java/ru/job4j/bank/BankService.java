package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .ifPresent(user -> this.users.get(user).add(account));
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl;
        rsl = users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
        return rsl;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl;
        Optional<User> user = this.findByPassport(passport);
        List<Account> accounts = this.users.get(user.get());
        rsl = accounts.stream()
                .filter(x -> x.getRequisite()
                        .equals(requisite))
                .findFirst();
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> srcAccountOptional = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dstAccountOptional = findByRequisite(destPassport, destRequisite);
        Account srcAccount;
        Account dstAccount;

        if (srcAccountOptional.isPresent() && dstAccountOptional.isPresent()) {
            srcAccount = srcAccountOptional.get();
            dstAccount = dstAccountOptional.get();
            if (srcAccount.getBalance() - amount < 0) {
                return false;
            }
        } else return false;
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        dstAccount.setBalance(dstAccount.getBalance() + amount);
        return true;
    }
}