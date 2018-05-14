package pl.sii.eu;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseCheckerImpTest {
    private final String str1 = "Qwerty";
    private final String str2 = "qwerty";

    private UpperCaseCheckerImp upperCaseCheckerImp = new UpperCaseCheckerImp();

    @Test
    public void shouldReturnTrue() {
        assertTrue(upperCaseCheckerImp.hasUpperCaseLetters(str1));
    }

    @Test
    public void shouldReturnFalse() {
        assertFalse(upperCaseCheckerImp.hasUpperCaseLetters(str2));
    }
}