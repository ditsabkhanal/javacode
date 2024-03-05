import java.util.Arrays;
public class welcome {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        //command line values are passes as an argument args
        //which is being displayed as an text by converting
        //array into string
        System.out.println("Class is lead by" + args[0]);
        //args[0] accesses first element of an array
        
        
        // String s = null;
        //  System.out.println(s.concat("OOP"));
    }
}
