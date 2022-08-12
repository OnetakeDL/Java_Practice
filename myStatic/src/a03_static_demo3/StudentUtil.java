package a03_static_demo3;

import java.util.ArrayList;

public class StudentUtil {

    //privatize the constructor
    //so outside world can NOT create this object
    private StudentUtil() {
    }

    //static methods
    public static int getMaxAge(ArrayList<Student> list) {
        //1.define an object of reference(age)
        int max = list.get(0).getAge();

        //2.loop through the list
        for (int i = 1; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if (tempAge > max) {
                max = tempAge;
            }
        }
        //3. return the result
        return max;
    }
}
