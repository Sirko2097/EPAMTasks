package regex.controller;

import model.Student;
import regex.model.Student;
import service.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static view.IConstants.InputConstants.*;
import static view.IConstants.Regex.*;

public class StudentController {
    private Bundle bundle = Bundle.INSTANCE;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /*create new student and an him into the list*/
    public Student createStudent() {
        Student student = new Student();
        String firstName = inputInfo(bundle.getValue(INPUT_FIRST_NAME), bundle.getValue(FIRST_NAME_REGEX));
        String lastName = inputInfo(bundle.getValue(INPUT_LAST_NAME), bundle.getValue(LAST_NAME_REGEX));
        String dayOfBirth = inputInfo(bundle.getValue(INPUT_BIRTHDAY), bundle.getValue(BIRTHDAY_REGEX));
        String phoneNumber = inputInfo(bundle.getValue(INPUT_PHONE_NUMBER), bundle.getValue(PHONE_NUMBER_REGEX));
        String address = inputInfo(bundle.getValue(INPUT_ADDRESS), bundle.getValue(ADDRESS_REGEX));

        student.addFirstName(firstName).addLastName(lastName).addAddress(address).
                addPhoneNumber(phoneNumber).addDateOfBirth(dayOfBirth);
        return student;
    }

    private String inputInfo(String info, String regex) {
        String str = " ";
        try {
            str = reader.readLine();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        if (correctInput(info, regex)){
            return str;
        }
        System.out.println(bundle.getValue(WRONG_INPUT));
        return null;
    }

    private boolean correctInput(String info, String regex) {
        return info.trim().matches(regex);
    }
}
