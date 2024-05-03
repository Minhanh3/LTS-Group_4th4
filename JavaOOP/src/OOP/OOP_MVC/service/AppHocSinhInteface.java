package OOP.OOP_MVC.service;

import OOP.OOP_MVC.model.HocSinh;

public interface AppHocSinhInteface {
    boolean addNew(HocSinh input);

    boolean remakeHocSinh(HocSinh hsNew, int id);

    boolean deleteHocSinh(int id);

    boolean showEveryThing();
}
