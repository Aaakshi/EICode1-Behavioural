package com.Akshi.assignments;

/**
 * Concrete class for essay assignments.
 */
public class EssayAssignment extends Assignment {
    @Override
    protected void uploadFiles() {
        System.out.println("Uploading essay document...");
    }

    @Override
    protected void checkForPlagiarism() {
        System.out.println("Checking essay for plagiarism...");
    }

    @Override
    protected void gradeAssignment() {
        System.out.println("Grading essay based on content and structure...");
    }
}
