package OOP.OOP_MVC.model;

import OOP.OOP_MVC.lib.InputHelper;

public class HocSinh {
    private int id;
    private String name;
    private int age;

    public HocSinh() {
        id = InputHelper.inputHelper("Mời nhạp id", "Lỗi nhập vào");
        name = InputHelper.StringHelper("Mời nhập ten", "ten nhap vao khong dung", 3, 50);
        age = InputHelper.inputHelper("Mời nhạp age", "Lỗi nhập vào");
    }

    public void showInfo() {
        System.out.println("Id : " + id);
        System.out.println("Ten hoc sinh : " + name);
        System.out.println("Age : " + age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
