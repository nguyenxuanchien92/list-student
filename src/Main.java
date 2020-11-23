import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // Tạo HashMap để lưu danh sách sinh viên
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("Smith", 30);
        hasMap.put("Anderson", 31);
        hasMap.put("Andra", 20);
        hasMap.put("Taylor", 27);
        hasMap.put("SimSon", 30);
        System.out.println("Display entries  in HashMap");
        System.out.println(hasMap + "\n");
        ;

        // Tạo TreeMap để lưu key theo thứ tự giảm dần
        Map<String, Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap+"\n");

        //Tạo LinkedHashMap để lưu danh sách sinh viên và hiển thị
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("Display entries in linked hash map");
        System.out.println(linkedHashMap);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
