package Controller;

import Model.CourseInfo;
import Model.MonWedFri;
import Model.TueThu;

import java.util.List;

/**
 * ConflictDetector.java
 *
 * This class is the key class: to detect if courses conflict
 *
 * @Yilun Qian
 */
public class ConflictDetector {
    private MonWedFri monWedFri;
    private TueThu tueThu;

    public ConflictDetector(MonWedFri monWedFri) {
        this.monWedFri = monWedFri;
    }

    public ConflictDetector(TueThu tueThu) {
        this.tueThu = tueThu;
    }

    public ConflictDetector(MonWedFri monWedFri, TueThu tueThu) {
        this.monWedFri = monWedFri;
        this.tueThu = tueThu;
    }

    public void detector() {
        List<CourseInfo> monWedFriCourses = monWedFri.getCourses();
        List<CourseInfo> tueThuCourses = tueThu.getCourses();
        boolean flag = true;
        int index1 = 0;

        for (CourseInfo course1 : monWedFriCourses) {
            index1++;

            for (int j = index1; j < monWedFriCourses.size(); j++) {
                CourseInfo course2 = monWedFriCourses.get(j);

                boolean pass = detectorHelper(course1, course2);
                if (!pass) {
                    printResult(course1, course2);
                    flag = false;
                }
            }
        }

        for (CourseInfo course1 : tueThuCourses) {
            index1++;

            for (int j = index1; j < tueThuCourses.size(); j++) {
                CourseInfo course2 = tueThuCourses.get(j);

                boolean pass = detectorHelper(course1, course2);
                if (!pass) {
                    printResult(course1, course2);
                    flag = false;
                }
            }
        }

        if (flag) {
            System.out.println("All courses passed!");
        }

    }

    private boolean detectorHelper(CourseInfo course1, CourseInfo course2) {
        if (course1.getDate().equals(course2.getDate())) {
            if (course1.getTime().getStartT() > course2.getTime().getEndT()
                    || course1.getTime().getEndT() < course2.getTime().getStartT()
                    || course1.getTime().getEndT() < course2.getTime().getStartT()) {
                return true;
            }
            return false;
        }
        // Courses are NOT in the same time ==> pass
        return true;
    }

    private void printResult(CourseInfo course1, CourseInfo course2) {
        System.out.println("Conflict detected!");
        System.out.println(course1.toString() + " && " + course2.toString());
    }
}
