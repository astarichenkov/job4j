package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (!users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        List<Account> userAccounts = users.get(findByPassport(passport));
        for (Account account : userAccounts) {
            if (account.getRequisite().equals(requisite)) {
                return account;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        if (findByRequisite(srcPassport, srcRequisite) == null || findByRequisite(srcPassport, srcRequisite).getBalance() - amount < 0) {
            return rsl;
        }

        User user1 = findByPassport(srcPassport);
        List<Account> list1 = users.get(user1);
        int index1 = list1.indexOf(findByRequisite(srcPassport, srcRequisite));
        double balance1 = users.get(user1).get(index1).getBalance() - amount;
        users.get(user1).get(index1).setBalance(balance1);

        User user2 = findByPassport(destPassport);
        List<Account> list2 = users.get(user2);
        int index2 = list2.indexOf(findByRequisite(destPassport, destRequisite));
        double balance2 = users.get(user2).get(index2).getBalance() + amount;
        users.get(user2).get(index2).setBalance(balance2);

        return rsl;
    }
}