package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */

    public ArrayList find(String key) {
        Predicate<Person> personName = (person) -> person.getName().equals(key);
        Predicate<Person> personSurname = (person) -> person.getSurname().equals(key);
        Predicate<Person> personAddress = (person) -> person.getAddress().equals(key);
        Predicate<Person> personPhone = (person) -> person.getPhone().equals(key);
        var combine = personName.or(personSurname).or(personAddress).or(personPhone);
        var result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}