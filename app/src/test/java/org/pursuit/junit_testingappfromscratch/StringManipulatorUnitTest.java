package org.pursuit.junit_testingappfromscratch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringManipulatorUnitTest {

    private StringManipulator stringManipulator;

    @Before
    public void setUp() throws Exception{
        stringManipulator = StringManipulator.getSingleInstance();
    }

    @Test
    public void check_is_less_than_10(){
        //Given
        String input = "OmololaAbudu";

        //When
        boolean expected = false;
        boolean actual = stringManipulator.isLessThan10(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_is_less_than_10_with_null_value(){
        //OR DO THIS WAY FOR TRUE/FALSE RETURN TYPE METHODS
        String input = null;

        Assert.assertTrue(stringManipulator.isLessThan10(input));

    }

    @Test
    public void check_is_odd_length(){
        String input = "Lolas";

        boolean expected = true;
        boolean actual = stringManipulator.isOddLength(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_is_odd_length_with_null_value(){
        String input = null;

        boolean expected = false;
        boolean actual = stringManipulator.isOddLength(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_zipper_words(){
        String first = "LOLA";
        String second = "lola";

        String expected = "LlOoLlAa";
        String  actual = stringManipulator.zipperWords(first, second);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_zipper_words_with_different_length_words(){
        String first = "LOLAMOM";
        String second = "lola";

        String expected = "LlOoLlAaMOM";
        String  actual = stringManipulator.zipperWords(first, second);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_zipper_words_with_null_values(){
        String first = null;
        String second = null;

        String expected = "";
        String  actual = stringManipulator.zipperWords(first, second);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_deconstructed_word(){
        String word = "Lola";

        String expected = "Ll oa";
        String  actual = stringManipulator.deconstructedWord(word);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_deconstructed_word_with_null_value(){
        String word = null;

        String expected = "";
        String  actual = stringManipulator.deconstructedWord(word);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_word_sum(){
        String first = "Lola";
        String second = "Abudu";

        int expected = 9;
        int actual = stringManipulator.wordSum(first, second);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_word_sum_with_null_values(){
        String first = null;
        String second = null;

        int expected = 0;
        int actual = stringManipulator.wordSum(first, second);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_longest_word(){
        String[] word = {"Lola", "Abudu"};

        String expected = "Abudu";
        String actual = stringManipulator.longestWord(word);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_longest_word_with_null_value(){
        String[] word = null;

        String expected = "";
        String actual = stringManipulator.longestWord(word);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_word_sort(){
        String[] word = {"today", "is", "monday"};

        String[] expected = {"is", "today", "monday"};
        String[] actual = stringManipulator.wordSort(word);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void check_word_sort_with_null_value(){
        String[] word = null;

        String[] expected = null;
        String[] actual = stringManipulator.wordSort(word);

        Assert.assertArrayEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception{
       stringManipulator = null;
    }
}
