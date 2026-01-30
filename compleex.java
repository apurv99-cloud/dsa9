import java.util.*;

public class compleex {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the real and imaginary part of complex number");
        int a = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Please input the real and imaginary part of another complex number");
        int b = sc.nextInt();
        int d = sc.nextInt();

        Complex c1 = new Complex();
        if ((a + b == 0) || ((b - a) == 0) || (a * b == 0)) {
            System.out.println("The sum of complex numbers are " + c1.sumofimgpart(c, d) + "i");
        } else if ((c + d == 0) || ((d - c) == 0) || (c * d == 0)) {
            System.out.println("The sum of complex numbers are " + c1.sumofrealpart(a, b) + "i");

        } else {
            System.out.println(
                    "The sum of the complex numbers is " + c1.sumofrealpart(a, b) + " + i" + c1.sumofimgpart(c, d));
        }

    }

}

class Complex {
    int sumofrealpart(int a, int b) {
        if (a + b == 0) {
            System.out.println("The complex number is purely imaginary");
        }
        return a+b;

    }

    int sumofimgpart(int a, int b) {
        if (a + b == 0) {
            System.out.println("The complex number is purely real");
        }
        return a + b;
    }

    int differenceofrealpart(int a, int b) {
        return b - a;
    }

    int differenceofimgpart(int a, int b) {
        return b - a;
    }

    int productofrealpart(int a, int b) {
        return a * b;
    }

    int productofimgpart(int a, int b) {
        return a * b;
    }

}
