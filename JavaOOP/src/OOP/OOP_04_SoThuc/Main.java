package OOP.OOP_04_SoThuc;

public class Main {
    public static void main(String[] args) {
        SoThuc soThuc1 = new SoThuc();
        SoThuc soThuc2 = new SoThuc();
        SoThuc soThuc3 = new SoThuc();
        System.out.println("So lon nhat: "+SoThuc.TimMax(soThuc1,soThuc2,soThuc3));
        System.out.println("Can bac n: "+soThuc1.canBacN(3));
    }
}