package OOP.OOP_19_BinhLinh;

public class DauSi extends BinhLinh {
    @Override
    public double getSucManh() {
        return super.getSucManh()*1.7;
    }

    public DauSi(String ten) {
        super(ten);
    }
}
