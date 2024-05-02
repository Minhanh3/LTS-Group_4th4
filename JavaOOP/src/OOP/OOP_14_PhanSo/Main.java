package OOP.OOP_14_PhanSo;

public class Main {
    public static void main(String[] args) {
//        PhanSo phanSo = new PhanSo();
//        System.out.println(phanSo.inThongTin());
        PhanSo phanSo = new PhanSo(40, 25);
        PhanSo phanSo2 = new PhanSo(40, 25);
        System.out.println("phan so 1 " + phanSo.inThongTin());
        System.out.println("phan so 2 " + phanSo2.inThongTin());
        System.out.println(PhanSo.congPhanSo(phanSo, phanSo2).inThongTin());
//        System.out.println(PhanSo.truPhanSo(phanSo, phanSo2).inThongTin());
    }
}
