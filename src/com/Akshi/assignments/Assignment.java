package com.Akshi.assignments;

/**
 * Abstract class that defines the template for assignment submission.
 */
public abstract class Assignment {
    /**
     * Template method for the assignment submission process.
     */
    public final void submitAssignment() {
        uploadFiles();
        checkForPlagiarism();
        gradeAssignment();
        giveFeedback();
    }

    protected abstract void uploadFiles();

    protected abstract void checkForPlagiarism();

    protected abstract void gradeAssignment();

    private void giveFeedback() {
        System.out.println("Feedback given to student.");
    }
}
