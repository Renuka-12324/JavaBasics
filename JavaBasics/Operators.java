public class Operators {
    public static void main(String[] args) {

    // Arithmetic
        int x = 100 + 50;
        System.out.println(x);

        int y = 100 - 50;
        System.out.println(y);

        int z = 10 * 50;
        System.out.println(z);

        int a = 100 / 50;
        System.out.println(a);

        int b = 101 % 50;
        System.out.println(b);


        // Assignment operator
        int c = 10;
        System.out.println(c);

        int d = 10;
        d += 5;           
        System.out.println(d);


        int e = 5;
        e >>= 3;
        System.out.println(e);


        // Comparision operator
        int x1 = 5;
        int y1 = 3;
        //greater than
        System.out.println(x1 > y1);

        //equal
        System.out.println(x1 == y1);
        
        //not equal
        System.out.println(x1 != y1);

        //less than
        System.out.println(x1 < y1);

        //	Greater than or equal to
        System.out.println(x1 > y1);

        //Less than or equal to
        System.out.println(x1 > y1);


//logical operators

//and
int r = 5;
    System.out.println(r > 3 && r < 10);

    //or
    System.out.println(r > 3 || r < 10);

    //not
    System.out.println(!(r > 3 && r < 10));
      }
}
