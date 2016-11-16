package View;

import Controller.ConflictDetector;
import Controller.SlashManager;
import Controller.SplitCourses;
import Model.CourseInfo;
import Model.CourseTime;
import Model.MonWedFri;
import Model.TueThu;

import java.util.Scanner;

/**
 * Main.java
 *
 * This class is to launch the app
 *
 * @Yilun Qian
 */
public class Main {
    public static void main(String[] args) {
        MonWedFri monWedFri = new MonWedFri();
        TueThu tueThu = new TueThu();
        SplitCourses splitCourse = new SplitCourses();
        ConflictDetector conflictDetector = new ConflictDetector(monWedFri, tueThu);
        SlashManager sm = new SlashManager();

        System.out.println("Please enter the number of courses you want to detect: ");
        int count = new Scanner(System.in).nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("CMPT 165 \n 1130\n 1220\n Fri\n Bby");

            String cn, date, location;
            CourseTime ct;
            try {
//                cn = new Scanner(System.in).nextLine();
//                ct = new CourseTime(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt());
//                date = new Scanner(System.in).nextLine();
//                location = new Scanner(System.in).nextLine();

                cn = "CMPT 165";
                ct = new CourseTime(1130, 1220);
                date = "Mon/Wed/Fri";
                location = "BBY";


            } catch (Exception e) {
                System.out.println(e);
                continue;
            }

            if (sm.slashDetector(date)) {
                // Initialize the arrayList of date
                sm.setDates(date);
                System.out.println(cn + " " + ct + " " + date + " " + " " + location);

                for (String subDate : sm.getDateList()) {
                    System.out.println(subDate);
                    CourseInfo ci = new CourseInfo(cn, ct, subDate, location);
                    System.out.println(ci);
                    splitCourse.split(ci, monWedFri, tueThu);
                }
            }

            CourseInfo ci1 = new CourseInfo("CMPT 222", new CourseTime(1150, 1440), "Mon", "Bby");
            splitCourse.split(ci1, monWedFri, tueThu);
        }

        conflictDetector.detector();
    }
}
