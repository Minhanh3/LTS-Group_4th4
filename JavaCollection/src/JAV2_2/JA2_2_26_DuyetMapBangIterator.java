package JAV2_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JA2_2_26_DuyetMapBangIterator {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("Viet Nam", "Ha Noi");
        map.put("Hoa Ky", "Washington, D.C");
        map.put("Han Quoc", "Seoul");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " la thu do cua " + value);
        }
    }
}
