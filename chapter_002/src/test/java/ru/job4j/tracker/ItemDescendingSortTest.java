package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemDescendingSortTest {
    @Test
    public void when312() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test3");
        Item item2 = new Item("test1");
        Item item3 = new Item("test2");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Collections.sort(tracker.items, new ItemDescendingSort());
        List<Item> expected = new ArrayList<Item>();
        expected.add(item1);
        expected.add(item3);
        expected.add(item2);
        List<Item> result = tracker.findAll();
        assertThat(result, is(expected));
    }
}
