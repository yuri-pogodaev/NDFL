package ru.diasoft.util;

import java.util.HashMap;
import java.util.Map;

public class Range {
    Map<Integer, String> map = new HashMap<>();
    {
        map.put(0, "O2:AA2");
        map.put(1, "O4:X4");
        map.put(2, "AA4:AC4");
        map.put(3, "I7:O7");
        map.put(4, "AE7:AF7");
        map.put(5, "M9:Y9");
        map.put(6, "H11:AQ11");
        map.put(7, "H13:AQ13");
        map.put(8, "H15:AQ15");
        map.put(9, "L17:L17");
        map.put(10,"T17:U17");
//        map.put(11, "W17:Y17");
//        map.put(12, "AA17:AD17");
        map.put(11, "AO17:AQ17");
        map.put(12, "L19:M19");
        map.put(13, "W19:AQ19");
        map.put(14, "AG21:AH21");
        map.put(15, "G23:U23");
        map.put(16, "G24:U24");
        map.put(17, "AG25:AQ25");
        map.put(18, "G27:Q27");
        map.put(19, "G29:Q29");
        map.put(20, "U57:AJ57");
        map.put(21, "U59:AJ59");
    }

     public  Map<Integer, String> getRange() {
        return map;
     }
}
