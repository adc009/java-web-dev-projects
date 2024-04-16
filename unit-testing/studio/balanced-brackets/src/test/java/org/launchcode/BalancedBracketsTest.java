package org.launchcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void twoOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void oneOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void twoPairsBracketsNestedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void twoPairsBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void manyOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[[[["));
    }

    @Test
    public void blankReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void textWrappedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Sample Text]"));
    }

    @Test
    public void textWovenReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Sam[ple T]ext"));
    }

    @Test
    public void textWovenTwoReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("aasldkf[jakl]sdfjklasdj[klasd]kjfl"));
    }

    @Test
    public void manyPairsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]][[[]]][[]][]"));
    }

    @Test
    public void reversedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}