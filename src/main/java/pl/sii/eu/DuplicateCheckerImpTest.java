package pl.sii.eu;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateCheckerImpTest {

    private DuplicateChecker duplicateChecker = new DuplicateCheckerImp();

    private final String str1 = "q qwertyuiop";
    private final String str2 = "Q Qwertyuiop";
    private final String str3 = "q q    \n\nwertyuiop";
    private final String str4 = "! !    \n\nwertyuiop";


    private final String str5 = "q    \n\nwertyuiop";
    private final String str6 = "q Q    \n\nwertyuiop";
    private final String str7 = "   \n\nwertyuiop";
    private final String str8 = " !;  \n\nwertyuiop";

    @Test
    public void shouldReturnTrue() {
        assertTrue(duplicateChecker.hasDuplicateCharacters(str1));
        assertTrue(duplicateChecker.hasDuplicateCharacters(str2));
        assertTrue(duplicateChecker.hasDuplicateCharacters(str3));
        assertTrue(duplicateChecker.hasDuplicateCharacters(str4));
    }

    @Test
    public void shouldReturnFalse() {
        assertFalse(duplicateChecker.hasDuplicateCharacters(str5));
        assertFalse(duplicateChecker.hasDuplicateCharacters(str6));
        assertFalse(duplicateChecker.hasDuplicateCharacters(str7));
    }
}