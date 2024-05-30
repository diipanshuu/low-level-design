package builder_design_pattern;

public class Client {
    public static void main(String[] args) {
//        Student student = new Student("Joey", -25);

        Student student = Student.builder()
                .setName("Joey")
                .setAge(25)
                .setGender("Male")
                .build();
        System.out.println(student);

        Student student1 = Student.builder()
                .setName("Ross")
                .setAge(25)
                .build();
    }
}
