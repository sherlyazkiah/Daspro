public class ExampleVariable24 {
    public static void main(String[] args) {
        String hobbies = "Playing futsal";
        boolean isSmart = true;
        char gender = 'M';
        byte age = 20;
        double gpa = 3.38, height = 1.68;
        System.out.println(hobbies);
        System.out.println("Are you smart? " + isSmart);
        System.out.println("Gender: " + gender);
        System.out.println("My current age is " + age);
        System.out.printf("My GPA is %s and my height is %s meters", gpa, height);
        // or System.out.printf("My GPA is %s and my height is %s meters", $gpa, height);
        // printf = String.format

    }
}