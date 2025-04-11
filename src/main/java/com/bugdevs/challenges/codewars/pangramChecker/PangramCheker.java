package com.bugdevs.challenges.codewars.pangramChecker;

public final class PangramCheker {
    PangramCheker() {
    }

    private static final int ALPHABET_COUNT = 26;

    public boolean check(String sentence) {
        if (sentence == null || sentence.length() < ALPHABET_COUNT) {
            return false;
        }
        int sentenceLetters = sentence.toLowerCase()
                .chars()
                .filter(c -> c >= 'a' && c <= 'z')
                .reduce(0, (bitmap, c) -> bitmap | (1 << (c - 'a')));
        return sentenceLetters == (1 << ALPHABET_COUNT) - 1;
    }
}
