package OOP.OOP_19_BinhLinh;

public class CungThu extends BinhLinh{
    @Override
    public double getSucManh() {
        return super.getSucManh()*1.3;
    }

    public CungThu(String ten) {
        super(ten);
    }
}
