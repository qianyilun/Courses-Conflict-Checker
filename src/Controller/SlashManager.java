package Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allen on 16/11/15.
 */
public class SlashManager {
    private List<String> dateList = new ArrayList<>();

    public boolean slashDetector(String s) {
        for (char c : s.toCharArray()) {
            if (c == '/') {
                return true;
            }
        }
        return false;
    }

    public List<String> getDateList() {
        return dateList;
    }

    public void setDates(String dates) {
        String[] s = dates.split("/");
        for (String ss : s) {
            dateList.add(ss);
        }
    }
}
