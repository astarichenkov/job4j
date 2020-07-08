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

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        Optional user = Optional.of(this.findByPassport(passport));
            List<Account> accounts = this.users.get(user.get());
            return accounts.stream().filter(x -> x.getRequisite()
                    .equals(requisite)).findFirst().orElse(null);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account dstAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || dstAccount == null || srcAccount.getBalance() - amount < 0) {
            return false;
        }
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        dstAccount.setBalance(dstAccount.getBalance() + amount);
        return true;
    }
}