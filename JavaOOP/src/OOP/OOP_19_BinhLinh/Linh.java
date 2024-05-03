package OOP.OOP_19_BinhLinh;

public class Linh extends BinhLinh {
    @Override
    public double getSucManh() {
        return super.getSucManh() * 1.1;
    }
    public Linh(String ten) {
        super(ten);
    }


}
