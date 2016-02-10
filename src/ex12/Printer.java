package ex12;

/**
 *
 * @author sofus
 */
class Printer {

    public static void print() {
        System.out.print("-");
        try {
            Thread.sleep(50);
        } catch (InterruptedException exn) {
        }
        System.out.print("|");
        }
}
