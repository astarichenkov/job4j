package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("2", 1),
                new Job("1", 2)

        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAscByName() {
        Comparator<Job> cmpNamePriority = new JobAscByName();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)

        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorAscByPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 5),
                new Job("Fix bug", 1)

        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByName() {
        Comparator<Job> cmpNamePriority = new JobDescByName();
        int rsl = cmpNamePriority.compare(
                new Job("Do nothing", 1),
                new Job("Fix bug", 1)

        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 5),
                new Job("Fix bug", 1)

        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority()
                .thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("Name1", 1),
                new Job("Name0", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}