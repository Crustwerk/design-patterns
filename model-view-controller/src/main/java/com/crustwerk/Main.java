package com.crustwerk;

/*
Necessità:
    Creare nuovi oggetti clonando istanze esistenti.

Quando usarlo:
    Quando vuoi evitare di ricreare oggetti complessi da zero.
*/

public class Main {
    public static void main(String[] args) {
        StudentModel model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Vikram Sharma");
        controller.updateView();
    }

    private static StudentModel retriveStudentFromDatabase() {
        StudentModel studentModel = new StudentModel();
        studentModel.setName("Lokesh Sharma");
        studentModel.setRollNo("15UCS157");
        return studentModel;
    }
}