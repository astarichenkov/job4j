package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenTwoAddresses() {
        ArrayList<Profile> profilesList = new ArrayList<Profile>(Arrays.asList(
                new Profile(new Address("Нижний Новгород", "Веденяпина", 4, 55)),
                new Profile(new Address("Дзержинск", "Чапаева", 22, 13))));
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(profilesList);
        ArrayList<Address> expected = new ArrayList<Address>(Arrays.asList(
                (new Address("Нижний Новгород", "Веденяпина", 4, 55)),
                (new Address("Дзержинск", "Чапаева", 22, 13))));
        assertThat(result, is(expected));
    }
}
