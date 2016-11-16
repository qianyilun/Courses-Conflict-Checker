package Model;

/**
 * Created by Allen on 16/11/15.
 */
public class CourseTime {
    private int StartT;
    private int EndT;

    public CourseTime(int startT, int endT) {
        StartT = startT;
        EndT = endT;
    }

    public int getStartT() {
        return StartT;
    }

    public void setStartT(int startT) {
        StartT = startT;
    }

    public int getEndT() {
        return EndT;
    }

    public void setEndT(int endT) {
        EndT = endT;
    }

    @Override
    public String toString() {
        String start = new StringBuilder().append(StartT).toString();
        start = new StringBuilder(start).insert(2, ":").toString();
        String end = new StringBuilder().append(EndT).toString();
        end = new StringBuilder(end).insert(2, ":").toString();
        return start + "-" + end;
    }
}
