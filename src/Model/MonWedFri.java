package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * MonWedFri.java
 *
 * This class is store all courses that will be hold on Monday, Wednesday, Friday
 *
 * @Yilun Qian
 */
public class MonWedFri {
    private CourseInfo courseInfo;
    private List<CourseInfo> courses = new ArrayList<>();

//    public MonWedFri(CourseInfo courseInfo, List<CourseInfo> courses) {
//        this.courseInfo = courseInfo;
//        this.courses = courses;
//    }

    public CourseInfo getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(CourseInfo courseInfo) {
        this.courseInfo = courseInfo;
    }

    public List<CourseInfo> getCourses() {
        return courses;
    }

    public void addCourse(CourseInfo course) {
        courses.add(course);
    }
}
