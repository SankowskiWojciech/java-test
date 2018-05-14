package pl.sii.eu;

public class UpperCaseCheckerImp implements UpperCaseChecker {
    @Override
    public boolean hasUpperCaseLetters(String input) {
        for (Character character : input.toCharArray()) {
            if (Character.isUpperCase(character)) {
                return true;
            }
        }
        return false;
    }
}
