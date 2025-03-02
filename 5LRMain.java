//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Primer {
    double x;
    double a;
    double b;

    Primer(double x, double a, double b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    double primer1() {
        return (3 * this.x + 5);
    }

    double primer2() {
        if (a == b) {
            return -1;
        } else {
            return ((this.a + this.b) / (this.a - this.b));
        }
    }

    int primer3() {
        if (this.b == 0) {
            return -1;
        } else {
            int z = (int) (this.a * this.x / this.b);
            if (z == 0 || z == 1) {
                return 1;
            } else if (z < 0) {
                return -1;
            } else {
                int res = 1;
                for (int i = 1; i <= z; i++) {
                    res *= i;
                }
                return res;
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Primer primer = new Primer(1,2,3);
        Primer nomer = new Primer(2.2,3.3,4.4);
        Primer zadacha = new Primer(5,6,4);
        System.out.println(primer.primer1());
        System.out.println(nomer.primer2());
        System.out.println(zadacha.primer3());
    }
}