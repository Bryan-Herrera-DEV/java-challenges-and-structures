package com.bugdevs.challenges.codewars.myLanguageSkills;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class MyLanguage {
    private MyLanguage() {
    }

    public static List<String> sortLanguages(final Map<String, Integer> results) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(results.entrySet());

        entries.removeIf(entry -> entry.getValue() < 60);

        entries.sort((o, t) -> t.getValue().compareTo(o.getValue()));

        List<String> r = new ArrayList<>();


        for (Map.Entry<String, Integer> entry : entries) {
            r.add(entry.getKey());
        }
        return r;
    }
}
