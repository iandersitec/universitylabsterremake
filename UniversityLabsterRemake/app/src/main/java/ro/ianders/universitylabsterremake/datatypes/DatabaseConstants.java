package ro.ianders.universitylabsterremake.datatypes;

/**
 * Created by paul.iusztin on 12.12.2017.
 */

public class DatabaseConstants {


    //courses constants
    public static final String COURSES_NODE = "courses";
    public static final String COURSE_DATA = "courseData";
    public static final String COURSE_PROFESSORS = "professors";
    public static final String COURSE_SCHEDULES = "schedules";
    public static final String COURSE_CHECKINS = "checkins";
    public static final String COURSE_KEY = "key";

    //students constants
    public static final String STUDENTS_NODE = "students";
    public static final String STUDENT_PROFILE = "profile";
    public static final String STUDENT_PASSWORD = "password";
    public static final String STUDENT_USERNAME = "username";
    public static final String STUDENT_FACULTY = "faculty";
    public static final String STUDENT_YEAR = "year";
    public static final String STUDENT_SECTION = "section";
    public static final String STUDENT_KEY = "key";
    public static final String STUDENT_UID = "userUID";


    //activity courses constants
    public static final String ACTIVITYCOURSES_NODE = "activitycourses";
    public static final String ACTIVITYCOURSE_TYPE = "type";
    public static final String ACTIVITYCOURSE_DATA = "activitycourseData";
    public static final String ACTIVITYCOURSE_PROFESSORS = "professors";
    public static final String ACTIVITYCOURSE_SCHEDULES = "schedules";
    public static final String ACTIVITYCOURSE_CHECKINS = "checkins";
    public static final String ACTIVITYCOURSE_KEY = "key";

    //schedule constants
    public static final String SCHEDULE_COURSESTEP = "step";
    public static final String SCHEDULE_DATE= "date";
    public static final String SCHEDULE_ENDTIME = "endTime";
    public static final String SCHEDULE_STARTTIME = "startTime";
    public static final String SCHEDULE_CHECKINS = "checkins";

    //messages course constants
    public static final String NOTES_NODE = "notes";
    public static final String NOTES_KEY = "key";
    public static final String NOTES_MESSAGES = "messages";

    //message constants
    public static final String MESSAGE_USERUID = "userUID";
    public static final String MESSAGE_STRING_MESSAGE = "message";

    //pending data
    public static final String PENDING_COURSE_STUDENTS_VALIDATIONS= "validations";
    public static final String PENDING_ACTIVITYCOURSE_STUDENTS_VALIDATIONS= "validations";
    public static final String PENDING_COURSE_NODE = "pendingcourse";
    public static final String PENDING_ACTIVITYCOURSE_NODE = "pendingactivitycourse";


}
