package ch.grafst.SITtoSHIT;


import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/**
 * @author Stephan Graf
 */
public class WordChainTest {

    @Test
    public void shouldHaveDistanceOne() {
        assertTrue(WordChain.hasDistanceOne("it", "sit"));
        assertTrue(WordChain.hasDistanceOne("it", "ist"));
        assertTrue(WordChain.hasDistanceOne("it", "its"));
        assertFalse(WordChain.hasDistanceOne("it", "it"));
        assertFalse(WordChain.hasDistanceOne("it", "i"));
        assertFalse(WordChain.hasDistanceOne("it", "itss"));
        assertFalse(WordChain.hasDistanceOne("it", "ssit"));
        assertFalse(WordChain.hasDistanceOne("it", "sits"));
        assertFalse(WordChain.hasDistanceOne("i", "2D"));
        assertFalse(WordChain.hasDistanceOne("i", "d"));
        assertFalse(WordChain.hasDistanceOne("i", "d"));
        assertTrue(WordChain.hasDistanceOne("", "a"));
        assertTrue(WordChain.hasDistanceOne("", "b"));
        assertFalse(WordChain.hasDistanceOne("a", ""));
        assertFalse(WordChain.hasDistanceOne("", ""));
    }


    public void shouldMeasureWordLenghtCorrectly() {

    }
}
