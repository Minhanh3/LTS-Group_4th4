package OOP.OOP_19_BinhLinh;

public class Main {
    public static void main(String[] args) {
        BinhLinh binhLinh = new BinhLinh();
        System.out.println(binhLinh.inThongTin());

        Linh linh = new Linh("linh");
        CungThu cungthu = new CungThu("cung thu");
        KiemSi kiemsi = new KiemSi("kiem si");
        DauSi dausi = new DauSi("dau si");
        BinhLinh.chienDau(kiemsi, cungthu);

    }
}
