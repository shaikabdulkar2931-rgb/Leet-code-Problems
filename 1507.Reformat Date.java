import java.util.HashMap;
import java.util.Map;

class Solution {
    public String reformatDate(String date) {
        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");

        String[] parts = date.split(" ");
        String dayStr = parts[0];
        String monthStr = parts[1];
        String yearStr = parts[2];

        String dayNum = dayStr.substring(0, dayStr.length() - 2);
        
        if (dayNum.length() == 1) {
            dayNum = "0" + dayNum;
        }

        return yearStr + "-" + monthMap.get(monthStr) + "-" + dayNum;
    }
}
