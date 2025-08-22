package Assesement_day4;
class After12th {
    void displayOptions() {
        System.out.println("Options after 12th: Engineering, Medical, Other Courses");
    }
}

// Level 1 subclasses
class Engineering extends After12th {
    void showBranches() {
        System.out.println("Engineering Branches: IT, Mechanical, CS");
    }
}

class Medical extends After12th {
    void showBranches() {
        System.out.println("Medical Courses: MBBS, BDS");
    }
}

class OtherCourses extends After12th {
    void showBranches() {
        System.out.println("Other Courses: BBA, BCA");
    }
}

// Level 2 subclasses of Engineering
class IT extends Engineering {
    void courseDetails() {
        System.out.println("IT: Information Technology focuses on software, networking, and data.");
    }
}

class Mechanical extends Engineering {
    void courseDetails() {
        System.out.println("Mechanical: Focus on machinery, design, and manufacturing.");
    }
}

class CS extends Engineering {
    void courseDetails() {
        System.out.println("CS: Computer Science focuses on programming, AI, and algorithms.");
    }
}

// Level 2 subclasses of Medical
class MBBS extends Medical {
    void courseDetails() {
        System.out.println("MBBS: Bachelor of Medicine, Bachelor of Surgery.");
    }
}

class BDS extends Medical {
    void courseDetails() {
        System.out.println("BDS: Bachelor of Dental Surgery.");
    }
}

// Level 2 subclasses of OtherCourses
class BBA extends OtherCourses {
    void courseDetails() {
        System.out.println("BBA: Bachelor of Business Administration.");
    }
}

class BCA extends OtherCourses {
    void courseDetails() {
        System.out.println("BCA: Bachelor of Computer Applications.");
    }
}


public class Hospital_patient {

	public static void main(String[] args) {
		 // Parent object
        After12th after12th = new After12th();
        after12th.displayOptions();
        System.out.println();

        // Engineering side
        Engineering eng = new Engineering();
        eng.displayOptions();
        eng.showBranches();
        IT it = new IT();
        it.displayOptions();
        it.showBranches();
        it.courseDetails();
        Mechanical mech = new Mechanical();
        mech.courseDetails();
        CS cs = new CS();
        cs.courseDetails();
        System.out.println();

        // Medical side
        Medical med = new Medical();
        med.displayOptions();
        med.showBranches();
        MBBS mbbs = new MBBS();
        mbbs.courseDetails();
        BDS bds = new BDS();
        bds.courseDetails();
        System.out.println();

        // Other Courses side
        OtherCourses oc = new OtherCourses();
        oc.displayOptions();
        oc.showBranches();
        BBA bba = new BBA();
        bba.courseDetails();
        BCA bca = new BCA();
        bca.courseDetails();
	}

}
