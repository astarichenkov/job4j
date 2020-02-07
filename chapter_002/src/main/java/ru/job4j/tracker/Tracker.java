package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }


    /**
     * Метод проверяет в цикле все элементы массива this.items.
     *
     * @param key
     * @return Массив элементов, у которых совпадает name.
     */
    public Item[] findByName(String key) {
        int size = 0;
        Item[] result = new Item[this.items.length];
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                if (this.items[i].getName().equals(key)) {
                    result[size] = this.items[i];
                    size++;
                }
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    /**
     * Получение списка всех заявок.
     */
    public Item[] findAll(String key) {
        int size = 0;
        Item[] result = new Item[this.items.length];
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                result[size] = this.items[i];
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    /**
     * Метод public Item findById(String id) проверяет в цикле все элементы массива this.items,
     * сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.
     */
    public Item findById(String key) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getId().equals(key)) {
                return this.items[i];
            }
        }
        return new Item("Не найдено");
    }
}