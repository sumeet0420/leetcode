package com.learning.hashtable;

import java.util.*;

public class LeetCode1817_FindingTheUsersActiveMinutes {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {

        Set<Person> logsSet = new HashSet<>();
        for (int[] log : logs) {
            logsSet.add(new Person(log[0], log[1]));
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (Person person : logsSet) {
            count.put(person.id(), count.getOrDefault(person.id(), 0) + 1);
        }
        int[] res = new int[k];
        for (var entry : count.entrySet()) {
            res[entry.getValue() - 1]++;
        }
        return res;
    }
}

final class Person {
    private final int id;
    private final int time;

    Person(int id, int time) {
        this.id = id;
        this.time = time;
    }

    public int id() {
        return id;
    }

    public int time() {
        return time;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return this.id == that.id && this.time == that.time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time);
    }

    @Override
    public String toString() {
        return "Person[" + "id=" + id + ", " + "time=" + time + ']';
    }
}
