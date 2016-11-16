package Controller;

import Model.CourseInfo;
import Model.MonWedFri;
import Model.TueThu;

/**
 * SplitCourses.java
 *
 * This class is to address user inputs: courses and store them into MonWedFri.java or TueThu.java
 *
 * @Yilun Qian
 */
public class SplitCourses {
    private CourseInfo courseInfo;

//    public SplitCourses(CourseInfo courseInfo) {
//        this.courseInfo = courseInfo;
//    }

    public CourseInfo getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(CourseInfo courseInfo) {
        this.courseInfo = courseInfo;
    }

    public void split (CourseInfo courseInfo, MonWedFri monWedFri, TueThu tueThu) {
        if (courseInfo.getDate().equals("Mon")
                ||courseInfo.getDate().equals("Wed")
                ||courseInfo.getDate().equals("Fri")) {
            monWedFri.addCourse(courseInfo);
        }
        else {
            tueThu.addCourse(courseInfo);
        }
    }
}
