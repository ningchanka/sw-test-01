package demo;

public class MyRange {
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean startWithInclude() {
        return this.input.startsWith("[");
    }

    public int getStartNumber() {
        if(startWithInclude()){
            return this.input.charAt(1) - 48;
        }
        return this.input.charAt(1) - 47;
    }

    public boolean endWithInclude() {
        return false;
    }
}
