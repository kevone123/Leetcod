import java.util.Scanner;

public class Lab7Undone {
    public static void main (String [] args) {

        final int STUDENTS = 8;
        final int QUIZZES = 5;

        int [] [] scores = {
                {89, 90, 78, 100, 85},
                {86, 75, 80, 90, 82},
                {100, 98, 97, 99, 100},
                {89, 90, 78, 100, 85},
                {86, 75, 80, 90, 82},
                {100, 98, 97, 99, 100},
                {89, 90, 78, 100, 85},
                {86, 75, 80, 90, 82}};


        showStudentScores(scores, STUDENTS, QUIZZES);
        Scanner scnr = new Scanner(System.in);
        System.out.println("\nEnter student number between 0 and "+ (STUDENTS - 1));
        int student = Integer.parseInt(scnr.next());
        showScoresForOneStudent(scores, student, QUIZZES);
        System.out.println("\nThe average score for student " + student + " is " +
                getAverageForStudent(scores, student, QUIZZES));

    }// End main

    public static void showStudentScores(int [] [] scores, int students, int quizzes) {
        // first print the top header row
        System.out.format("     |      Scores\n");
        System.out.format("Stud.|");
        for(int i = 1; i<= quizzes;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("------------------------------------------");
        for(int row = 0 ;row <= quizzes;row++) {
            // print left most column first
            System.out.format("%4d |",row);
            for(int col =0;col <= students;col++) {
                System.out.format("%4d",scores[row][col]);
            }// End col for loop
            System.out.println();
        }// End row for loop
    }// End method

    public static double getAverageForStudent(int [] [] scores, int studentRow, int numberOfQuizzes)
    {
        int sum = 0;

        for (int i = 1; i < numberOfQuizzes; i++)
        {
            sum += scores[i][studentRow];
        }
        return (double)numberOfQuizzes/sum;
    }

    public static void showScoresForOneStudent(int [] [] scores, int student,int numberOfQuizzes)
    {
        System.out.print("Scores: ");
        for (int i = 0; i < numberOfQuizzes-1; i++)
        {
            System.out.print(scores[i][student]+" ");
        }
    }
}