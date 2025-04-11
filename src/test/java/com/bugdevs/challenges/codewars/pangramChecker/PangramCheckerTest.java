package com.bugdevs.challenges.codewars.pangramChecker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PangramCheckerTest {
    private final PangramCheker checker = new PangramCheker();

    @Test
    void testNullInput() {
        assertFalse(checker.check(null), "Null input should return false");
    }

    @Test
    void testEmptyString() {
        assertFalse(checker.check(""), "Empty string should return false");
    }

    @Test
    void testShortString() {
        assertFalse(checker.check("abc"), "Too short to be a pangram");
    }

    @Test
    void testValidLowerCasePangram() {
        assertTrue(checker.check("the quick brown fox jumps over the lazy dog"),
                "Valid lowercase pangram should return true");
    }

    @Test
    void testValidUpperCasePangram() {
        assertTrue(checker.check("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"),
                "Valid uppercase pangram should return true");
    }

    @Test
    void testMixedCasePangram() {
        assertTrue(checker.check("The Quick Brown FoX JumpS Over The LAzy Dog"),
                "Mixed case pangram should return true");
    }

    @Test
    void testPangramWithPunctuation() {
        assertTrue(checker.check("The quick brown fox, jumps over the lazy dog!"),
                "Pangram with punctuation should return true");
    }

    @Test
    void testSentenceMissingOneLetter() {
        assertFalse(checker.check("The quick brown fox jumps over the lazy do"),
                "Missing one letter should return false");
    }

    @Test
    void testPangramWithNumbers() {
        assertTrue(checker.check("The quick brown fox jumps over the lazy dog 1234567890"),
                "Pangram with numbers should return true");
    }

    @Test
    void testOnlyAlphabetLettersShuffled() {
        assertTrue(checker.check("abcdefghijklmnopqrstuvwxyz"),
                "All letters of the alphabet should return true");
    }

    @Test
    void testRepeatedLettersButNotAllAlphabet() {
        assertFalse(checker.check("abcabcabcabcabcabcabcabcabcabcabc"),
                "Repeated but incomplete alphabet should return false");
    }

    @Test
    void testNonEnglishCharactersIgnored() {
        assertTrue(checker.check("The quick brown fóx jumps over the lazy dog"),
                "Non-English letters should be ignored and pangram still recognized");
    }

    @Test
    void testWhitespaceOnly() {
        assertFalse(checker.check("                    "),
                "Only whitespace should return false");
    }

    @Test
    void testSpecialCharactersOnly() {
        assertFalse(checker.check("!@#$%^&*()_+-=[]{}|;':,.<>?"),
                "Only special characters should return false");
    }
}
