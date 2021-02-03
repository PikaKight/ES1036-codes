public class Unit2assignment2 {
    /**
    public static double question5(){
        int a = 2, b = a+2;
        double b = 4;
        return (a/b);
    }
    */
    public static int question8(){
        int a = -14, b = 5;
        return (a%b);
    }

    public static String question9(){
        int a =4, b=8;
        a = ++b + a;
        return a + " " + b;
    }

    public static double question15(){
        double dx = 2.0;
        int ix = 5, iy = 2;

        return dx/iy*ix;
    }

    public static double question16(){
        double dx = 2.0;
        int ix = 5, iy = 2;

        return ix/iy*dx;
    }

    public static int question18(){
        int ix=5, iy=2, x=20;
        return x+ix%iy;
    }

    public static void main(String[] arg) {
        int number = 536;
        System.out.println(number/2);
        System.out.println(3*(4*1/2)-5);
//        System.out.println(question5());
        System.out.println(question8());
        System.out.println(question9());
        System.out.println(question15());
        System.out.println(question16());
        System.out.println(9*(1/3*3.0)+2);
        System.out.println(question18());
    }

}

// 1: a, 2: c, 3:b, 4:a, 5:c, 6:d, 7: c, 8: b, 9: e, 10: b, 11: b, 12: a, 13: e, 14:a
// 15: b, 16: b, 17: c, 18: d, 19: b, 20: b, 21: a, 22: c, 23: b, 24: c
