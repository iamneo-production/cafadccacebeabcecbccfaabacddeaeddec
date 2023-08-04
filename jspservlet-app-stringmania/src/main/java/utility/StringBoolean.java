// package utility;

public class StringBoolean {
    private String input1;
    private String input2;

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    // Method to check if the string1 contains string2.
    public boolean contains(String a,String b) {
        if (a.contains(b)) {
            return true;
        }
        return false;
    }

    // Method to check if the string starts with the given letter.
    public boolean startsWith(String a,String b) {
        if (a.startsWith(b)) {
            return true;
        }
        return false;
    }

    // Method to check if the string end with the given letter.
    public boolean endsWith(String a,String b) {
        if (a.endsWith(b)) {
            return true;
        }
        return false;
    }

    // Method to check if two strings are equal.
    public boolean equals(String a,String b) {
        if (a.equals(b)) {
            return true;
        }
        return false;
    }

    // Method to check if two strings are equal by ignoring the case.
    public boolean equalsIgnoreCase(String a,String b) {
        if (a.equalsIgnoreCase(b)) {
            return true;
        }
        return false;
    }
}