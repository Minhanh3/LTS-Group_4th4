package OOP.OOP_06_LopHoc;

public class Main {

    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc(01 , "Java" , 20 , "Phong 201" , "Manh");
        System.out.println(lopHoc.inThongTin());

        LopHoc lopHoc1 = new LopHoc();
        System.out.println(lopHoc1.inThongTin());
    }
}
