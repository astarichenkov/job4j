package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsNull.nullValue;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenTrackerHasSameItemsByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test1");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        List<Item> expected = new ArrayList<Item>();
        expected.add(item1);
        expected.add(item3);
        List<Item> result = tracker.findByName("test1");
        assertThat(result, is(expected));
    }

    @Test
    public void whenTrackerFindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test1");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        List<Item> expected = new ArrayList<Item>();
        expected.add(item1);
        expected.add(item2);
        expected.add(item3);
        List<Item> result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }


    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        Item bug2 = new Item("Bug");
        tracker.add(bug);
        tracker.add(bug2);
        String id = bug2.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}