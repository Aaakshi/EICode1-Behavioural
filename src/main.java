import java.util.InputMismatchException;
import java.util.Scanner;
import com.Akshi.sorting.SortingContext;
import com.Akshi.sorting.BubbleSort;
import com.Akshi.sorting.MergeSort;
import com.Akshi.assignments.Assignment;
import com.Akshi.assignments.CodingAssignment;
import com.Akshi.assignments.EssayAssignment;

public class Main {
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext();
        int[] array = { 5, 2, 9, 1, 5, 6 };

        try (Scanner scanner = new Scanner(System.in)) {
            // Sorting context example
            System.out.println("Choose sorting algorithm: 1 for Bubble Sort, 2 for Merge Sort");
            int choice = getValidIntInput(scanner);

            switch (choice) {
                case 1:
                    sortingContext.setStrategy(new BubbleSort());
                    break;
                case 2:
                    sortingContext.setStrategy(new MergeSort());
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }

            sortingContext.sortArray(array);
            System.out.println("Sorted array: " + java.util.Arrays.toString(array));

            // Assignment submission example
            System.out.println("\nChoose assignment type: 1 for Coding, 2 for Essay");
            int assignmentChoice = getValidIntInput(scanner);

            Assignment assignment;
            switch (assignmentChoice) {
                case 1:
                    assignment = new CodingAssignment();
                    break;
                case 2:
                    assignment = new EssayAssignment();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }

            assignment.submitAssignment();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }

    private static int getValidIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }
}
