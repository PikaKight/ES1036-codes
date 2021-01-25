public class Unit_2_assignment_1 {
    // returns the value for question 2, a%b
    public static int question2(int a, int b) {
        return (a%b);
    }
    //returns the answer to a+b/c-d answer b
    public static int question3(int a, int b, int c, int d) {
        return (a+(b/c)-d);
    }

    //returns the expression that equal zero
    public static String question4(){
        if (3-8%5 == 0) {
            return ("3-8%5");
        }
        else if (8%3-1 == 0){
            return ("8%3-1");
        }
        else if (9%3-1 == 0){
            return ("9%3-1");
        }
        else if (2-5%2 == 0){
            return ("2-5%2");
        }
        return ("There is no answer");
    }

    //returns the equations that equal 6.5
    public static String question6(float a, float b, float c, float x, float y) {
        if (((a/b)*x-y+c) == 6.5){
            return ("A");
        }
        else if (((a/b)*x-(a/b)*y+c) == 6.5) {
            return ("B");
        }
        else if ((a/(b*(x-y))+c) == 6.5) {
            return ("C");
        }
        else if ((((a/b)*x-y)+c) == 6.5) {
            return ("D");
        }
        else if ((a/(b*x-y)+c) == 6.5) {
            return ("E");
        }
        return ("None");
    }


    public static void main(String[] args) {
        System.out.println(question2(14,5));
        System.out.println(question3(14,5, 8, 9));
        System.out.println(question4());
        System.out.println(question6(5,10,6,3,2));
        // System.out.println("The answer is:");
        System.out.println("YES!");
    }
}
// question 1 is c, 5 is a, 7 is e, 8 is c, 9 is a, 11 is c, 12 is b, 13 is a, 14 is b, 15 is b