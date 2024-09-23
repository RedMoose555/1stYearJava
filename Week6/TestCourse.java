// Class representing a test for courses
class TestCourse {

    // Static nested class representing a Course
    static class Course {

        // Private instance variables for course details
        private String courseTitle; // Title of the course
        private String faculty; // Faculty associated with the course
        private int duration; // Duration of the course in years

        // Constructor to initialize course details
        public Course(String courseTitle, String faculty, int duration) {
            this.courseTitle = courseTitle;
            this.faculty = faculty;
            this.duration = duration;
        }
        // Method to display course details
        public void display() {
            System.out.printf("Course title: %s\nFaculty: %s\nDuration: %s\n", courseTitle, faculty, duration);
        }
    } // End of Course class

    // Main method to test the Course class
    public static void main(String[] args) {
        // Creating 3 Course objects
        Course c1 = new Course("B.Sc. (Hons) in Computer Science", "Informatics", 4);
        Course c2 = new Course("B.Sc in Bioinformatics", "Biology", 4);
        Course c3 = new Course("M.Sc. in Applied Artificial Intelligence", "Informatics", 2);

        // Displaying the Course objects
        System.out.println("Course Object 1:");
        c1.display();
        System.out.println("Course Object 2:");
        c2.display();
        System.out.println("Course Object 3:");
        c3.display();
    }
}

