package regex.model;

import java.util.ArrayList;

public enum Journal {
    INSTANCE;
    private ArrayList<Student> studentList = new ArrayList<Student>();

    Journal() {
    }

    {
        studentList.add(new Student().addFirstName("First name").addLastName("Last name")
                .addDateOfBirth("15.10.2015").addPhoneNumber("+11235855873")
                .addAddress("England, London, St. 54"));
        studentList.add(new Student().addFirstName("Odmen").addLastName("Sirko")
                .addDateOfBirth("20.03.1997").addPhoneNumber("+38093782132")
                .addAddress("Ukraine, Vinnytsia, Kyivska 29 54"));
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        if (student == null) {
            studentList.add(student);
        }
    }

}
