public class Student {
    private String firstname;
    private String lastname;
    private Class[] classes;
    // Class [] classes= new Class[3];


    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.classes = new Class[3];
    }

    @Override
    public String toString() {
        return "Student " +
                "firstname '" + firstname + '\'' +
                " lastname '" + lastname + '\''
                ;
    }

    public void enroll(Class c1) {
        if (alreadyextracted(c1)) return;

//        if (classes[classes.length - 1] != null) {
//            classes = increaseClassArray();
//        }

        if (!c1.maxCapacityReached()) {
            if (classes[classes.length - 1] != null) {
                classes = increaseClassArray();
                classes[classes.length - 1] = c1;

            } else {
                for (int i = 0; i < this.classes.length; i++) {
                    if (this.classes[i] == null) {
                        c1.enroll();
                        classes[i] = c1;
                        System.out.println("Kurs angemeldet");
                        break;
                    }
                }
            }
            } else{
                System.out.println("keine Anmeldung mehr möglich");
            }
        }


        private Class[] increaseClassArray () {
            Class[] temp = new Class[classes.length + 1];
            for (int i = 0; i < classes.length; i++) {
                temp[i] = classes[i];
            }
            return temp;
        }

        private boolean alreadyextracted (Class c1){
            for (int i = 0; i < classes.length; i++) {
                if (classes[i] != null) {
                    if (classes[i].getName().equals(c1.getName())) {
                        System.out.println(c1.getName() + " Beriets angemeldet");
                        return true;

                    }
                }
            }
            return false;
        }


        public void printClasses () {
            for (int i = 0; i < classes.length; i++) {
                if (classes[i] != null) {
                    System.out.println(classes[i].getName());
                } else {
                    System.out.println(classes[i]);
                }

            }
        }

        public Class[] getClasses () {
            return classes;
        }
    }

