package utility;
import net.java.swingfx.waitwithstyle.InfiniteProgressAdapter;

public class StringMethod {
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String lower(String a) {
        return a.toLowerCase();
    }

    public String upper(String a) {
        return a.toUpperCase();
    }

    public String firstCharacter(String a) {
        return String.valueOf(a.charAt(0));
    }

    public String length(String a) {
        return String.valueOf(a.length());
    }

    public String trim(String a) {
        return a.trim();
    }
}