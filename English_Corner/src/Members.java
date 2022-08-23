import java.util.ArrayList;

public class Members {
    private String name;
    private String home_location;
    private int high_school_class;
    private String college_location;
    private String major;
    private boolean further_study;

    public Members() {
    }

    public Members(String name, String home_location,
                   int high_school_class, String college_location,
                   String major, boolean further_study) {
        this.name = name;
        this.home_location = home_location;
        this.high_school_class = high_school_class;
        this.college_location = college_location;
        this.major = major;
        this.further_study = further_study;
    }

    public void introduce() {
        System.out.println("\nPlease introduce yourself~ \nJust take it easy!");
        System.out.println("You need to cover the basic information below.");
        System.out.println("Feel free to add anything!");
        System.out.println("\nYour name: " + name + "\n\nYour home address: " + home_location
                + "\n\nYour high school class: " + high_school_class
                + "\n\nYour college location: " + college_location
                + "\n\nYour major: " + major
                + "\n\nYour plan for further study: " + further_study);
    }

    public void showInfo() {
        System.out.println("\nBasic information: ");
        System.out.println(getName() + "\n" + getHome_location()
                + "\n" + getHigh_school_class() + "\n" + getCollege_location()
                + "\n" + getMajor() + "\n" + isFurther_study());
    }

    public String getName() {
        return name;
    }

    public String getHome_location() {
        return home_location;
    }

    public int getHigh_school_class() {
        return high_school_class;
    }

    public String getCollege_location() {
        return college_location;
    }

    public String getMajor() {
        return major;
    }

    public boolean isFurther_study() {
        return further_study;
    }

    public boolean ifContain(ArrayList<Members> list, int index) {
        if (list.get(index) == null) {
            return false;
        } else {
            return true;
        }
    }
}
