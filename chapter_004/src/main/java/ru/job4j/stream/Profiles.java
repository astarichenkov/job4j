package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    private Comparator sorted = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Profile left = (Profile) o1;
            Profile right = (Profile) o2;
            return left.getAddress().getCity().compareTo(right.getAddress().getCity());
        }
    };

    List<Address> collect(List<Profile> profiles) {
        profiles.sort(sorted);
        return profiles.stream().map(
                profile -> profile.getAddress()).distinct().collect(Collectors.toList());
    }
}
