package demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyRangeTest {
    @Test
    public void input_start_with_include(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.startWithInclude();
        assertTrue("Input should start with [", result);
    }

    @Test
    public void input_start_with_exclude(){
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.startWithInclude();
        assertFalse("Input should start with (", result);
    }

    @Test
    public void input_1_with_include_should_return_1(){
        MyRange myRange = new MyRange("[1,5]");
        int actualNumber = myRange.getStartNumber();
        assertEquals(1, actualNumber);
    }

    @Test
    public void input_1_with_exclude_should_return_2(){
        MyRange myRange = new MyRange("(1,5]");
        int actualNumber = myRange.getStartNumber();
        assertEquals(2, actualNumber);
    }

    @Test
    public void input_end_with_include(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.endWithInclude();
        assertTrue("Input should end with [", result);
    }

}