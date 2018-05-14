package pl.sii.eu;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCheckerImp implements DuplicateChecker {

    @Override
    public boolean hasDuplicateCharacters(String input) {
        Set<Character> characterSet = new HashSet<>();
        for (Character character : input.toCharArray()) {
            if (!Character.isWhitespace(character)) {
                 if (characterSet.contains(character)) {
                    return true;
                } else {
                    characterSet.add(character);
                }
            }
        }
        return false;
    }
}
