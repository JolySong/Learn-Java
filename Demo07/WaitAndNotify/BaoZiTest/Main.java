package WaitAndNotify.BaoZiTest;

public class Main {
    public static void main(String[] args) {

        BaoZI bz = new BaoZI();

        new BaoZiPu(bz).start();

        new ChiHuo(bz).start();
    }
}
