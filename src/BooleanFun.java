// test methods of creating boolean variables

public class BooleanFun {
    public static void main(String[] args) {

        //run tests
        test(1600);
        test(1700);
        test(2000);
        test(2009);
        test(45);
    }

    // print statement with test and year
    public static void test(int year) {
        System.out.println("isLeap(" + year + ") returns " + isLeap(year));
    }

    // test for leap year using rule set
    public static boolean isLeap(int n) {
        return ((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0);

/*
        // long form
        if (n % 400 == 0) {
            return true;
        } else if (n % 100 == 0) {
            return false;
        } else if (n % 4 == 0) {
            return true;
        } else { // all others
            return false;
        }
*/
    }
}
