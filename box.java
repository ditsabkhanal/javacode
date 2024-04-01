public class box {
    int l, b, h;

    public void showValue() {
        int volume = l * b * h;
        System.out.println("Volume of bos is" + volume);
    }

    public static void main(String[] args) {
        box b1 = new box();
        b1.l = 50;
        b1.b = 30;
        b1.h = 20;
        b1.showValue();
    }
}