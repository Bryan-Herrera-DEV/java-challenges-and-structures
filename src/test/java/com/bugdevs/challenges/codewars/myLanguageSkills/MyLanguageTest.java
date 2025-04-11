package com.bugdevs.challenges.codewars.myLanguageSkills;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

public class MyLanguageTest {
    @Test
    void testCase1() {
        Map<String, Integer> input = Map.of(
                "Java", 10,
                "Ruby", 80,
                "Python", 65
        );
        List<String> expected = List.of("Ruby", "Python");
        assertEquals(expected, MyLanguage.sortLanguages(input));
    }

    @Test
    void testCase2() {
        Map<String, Integer> input = Map.of(
                "Hindi", 60,
                "Greek", 71,
                "Dutch", 93
        );
        List<String> expected = List.of("Dutch", "Greek", "Hindi");
        assertEquals(expected, MyLanguage.sortLanguages(input));
    }

    @Test
    void testCase3() {
        Map<String, Integer> input = Map.of(
                "C++", 50,
                "ASM", 10,
                "Haskell", 20
        );
        List<String> expected = List.of();
        assertEquals(expected, MyLanguage.sortLanguages(input));
    }

    @Test
    void testCase4() {
        Map<String, Integer> input = Map.of(
                "Go", 99,
                "Scala", 70,
                "Rust", 85
        );
        List<String> expected = List.of("Go", "Rust", "Scala");
        assertEquals(expected, MyLanguage.sortLanguages(input));
    }

    @Test
    void testCase5() {
        Map<String, Integer> input = Map.of(
                "Perl", 30,
                "Lisp", 59,
                "COBOL", 1
        );
        List<String> expected = List.of();
        assertEquals(expected, MyLanguage.sortLanguages(input));
    }
}
