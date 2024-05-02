package OOP.OOP_19_BinhLinh;

public class Main {
    public static void main(String[] args) {
        BinhLinh binhLinh = new BinhLinh();
        System.out.println(binhLinh.inThongTin());
        BinhLinh binhLinh2 = new BinhLinh("linh", 70);
        BinhLinh binhLinh1 = new BinhLinh("Manh", 78);
        BinhLinh.chienDau(binhLinh2, binhLinh1);

    }
}
