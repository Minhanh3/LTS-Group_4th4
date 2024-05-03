package OOP.OOP_19_BinhLinh;

public class KiemSi extends BinhLinh{
    @Override
    public double getSucManh() {
        return super.getSucManh()*1.5;
    }

    public KiemSi(String ten) {
        super(ten);
    }
}
