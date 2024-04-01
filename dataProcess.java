public class dataProcess {
    int a, b;

    void sum() {
        // int sum = a + b;
        // System.out.println("The sum is" + sum);
        System.out.println("The sum is " + (a + b));
    }

    // void sum() {
    //these two methods have same signature so cannot place in same class
    // }

    void sum(int a, int b) {
        // int sum = a + b;
        // System.out.println("The sum is" + sum);
        System.out.println("The sum is " + (a+b) );
    }
    //this method have difference signature from above methods
    //as in java signature consists of:
    // 1. Method name
    // 2. Parameter list(no. of parameters + type of parameters)

    void sum(int a, double b) {
        // double sum = a + b;
        // System.out.println("The sum is" + sum);
        System.out.println("The sum is " + (a + b));
    }

    void sum(String firstname, String lastname) {
        System.out.println(firstname + " " + lastname);
    }

 
    
    
    
    public static void main(String[] args) {
        dataProcess pd = new dataProcess();
        pd.a = 12;
        pd.b = 21;

        pd.sum();
        pd.sum(100, 200);
        pd.sum(25, 55.55);
        // method overloading: Method name overloading
        pd.sum("Ditsab", "Khanal");
        // pd.sum(12.44f, 13.55f);
        //the one with double parameter is called by upcasting the value
        // pd.sum(12L,22L)
    }
}
