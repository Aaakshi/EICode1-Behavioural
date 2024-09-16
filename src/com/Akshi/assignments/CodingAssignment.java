package com.Akshi.assignments;

/**
 * Concrete class for coding assignments.
 */
public class CodingAssignment extends Assignment {
    @Override
    protected void uploadFiles() {
        System.out.println("Uploading coding files...");
    }

    @Override
    protected void checkForPlagiarism() {
        System.out.println("Checking code for plagiarism...");
    }

    @Override
    protected void gradeAssignment() {
        System.out.println("Running unit tests and grading coding assignment...");
    }
}
