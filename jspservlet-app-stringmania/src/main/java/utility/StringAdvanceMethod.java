package utility;
import net.java.swingfx.waitwithstyle.InfiniteProgressAdapter;

public class StringAdvanceMethod{
    private String Input1;
    private String Input2;
    
    public String getInput1(){
        return this.Input1;
    }
    public void setInput1(String Input1){
        this.Input1 = Input1;
    }
    public String getInput2(){
        return this.Input2;
    }
    public void setInput2(String Input2){
        this.Input2 = Input2;
    }
    
    //Method to concatenate two strings
    public String concat(String a,String b){
        return a + b;
    }
    
    //Method to split two strings
    public String split(String a,String b){
        String[] s = a.split(b);
        return s[0]+" "+s[1];
    }
    
    //Method to find the first character in the string
    public String firstChar(){
        return String.valueOf(this.Input1.charAt(0));
    }
    
    //Method to find the indexOf the string
    public String indexOf(String a,String b){
        return String.valueOf(a.indexOf(b));
    }
    
    //Method to trim the input string
    public String trimString(){
        return this.Input1.trim();
    }
}
