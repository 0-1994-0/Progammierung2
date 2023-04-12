public class ClassMain {
    public static void main(String[] args) {


        Class c1 = new Class("M1",74,7);

//        c1.getName();
//        c1.maxCapacityReached();
        c1.setEnrolledStudent(1);
        System.out.println(c1.maxCapacityReached());
        c1.enroll();
        c1.enroll();
        System.out.println(c1.getEnrolledStudent());

        Student s = new Student("Max", "M");
        System.out.println(s);
        s.enroll(c1);
        System.out.println(c1.getEnrolledStudent());

        Student r = new Student("Aurelie", "Z");
        System.out.println(r);

        Class [] cs = s.getClasses();
        for (int i=0;i< cs.length;i++){
            System.out.println(cs[i]);
        }








    }
}
