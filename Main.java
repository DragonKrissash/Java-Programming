import java.util.Scanner;

class Learner {
    // Member variables
    String name;
    int age;
    int mks;
    String stream;

    // Member Methods
    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        System.out.print("Enter student age: ");
        age = scanner.nextInt();

        System.out.print("Enter student marks: ");
        mks = scanner.nextInt();

        scanner.close();
    }

    void stream_allocation() {
        if (mks >= 500) {
            stream = "Artificial Intelligence";
        } else if (mks >= 200 && mks < 500) {
            stream = "Robotics";
        } else if (mks >= 75 && mks < 200) {
            stream = "Animation";
        } else {
            stream = "Try Again";
        }
    }

    void print() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Marks: " + mks);
        System.out.println("Stream Allocated: " + stream);
    }
}

public class Main {
    public static void main(String[] args) {
        Learner student = new Learner();
        student.input();
        student.stream_allocation();
        student.print();
    }
}