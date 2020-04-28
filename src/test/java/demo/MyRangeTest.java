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

}