package regex.controller;

import regex.model.Journal;
import regex.model.Student;
import regex.service.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import static regex.view.IConstants.InputConstants.LANGUAGE_CHANGER;

public class MainController {
    private Journal journal = Journal.INSTANCE;
    Bundle bundle = Bundle.INSTANCE;
    StudentController controller = new StudentController();

    public void addNewStudent() {
        journal.addStudent(controller.createStudent());
    }

    public void printJournal() {
        for (Student student :
                journal.getStudentList()) {
            System.out.println(student.toString());
        }
    }

    public void changeLanguage() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bundle.getValue(LANGUAGE_CHANGER));
        try {
            bundle.changeLocale(new Locale(reader.readLine()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
