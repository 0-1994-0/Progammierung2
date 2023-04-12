public class Class {
    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudent;


    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }

    public Class(String name, int hours, int maxCapacity) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        enrolledStudent = 0;
    }


    public void enroll() {
        if (maxCapacityReached()) {
            System.out.println("voll");
        } else {
            enrolledStudent++;
        }
    }

    public boolean maxCapacityReached() {

//        if (enrolledStudent==maxCapacity){
//            return true;
//        } else {
//
//            return false;
//        }
        return enrolledStudent == maxCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getEnrolledStudent() {
        return enrolledStudent;
    }

    public void setEnrolledStudent(int enrolledStudent) {
        this.enrolledStudent = enrolledStudent;
    }


}
