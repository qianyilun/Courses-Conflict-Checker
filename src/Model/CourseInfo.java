package Model;

/**
 * CourseInfo.java
 *
 * This class is to store the information about a course
 *
 * @Yilun Qian
 */
public class CourseInfo {
    private String name;
    private CourseTime time;
    private String date; // Mon, Wed, Fri; Tue, Thu
    private String location;

    public CourseInfo(String name, CourseTime time, String date, String location) {
        this.name = name;
        this.time = time;
        this.date = date;
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseTime getTime() {
        return time;
    }

    public void setTime(CourseTime time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        String s = name + " " + date + " " + time.toString() + " " + location;
        return s;
    }

}
