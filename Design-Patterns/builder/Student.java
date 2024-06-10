package builder;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String major;
    private String course;
    private String phone;
//    public Student(String name, int age, String gender, String major, String course, String phone) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.major = major;
//        this.course = course;
//        this.phone = phone;
//    }
//    public Student(String name, int age) {
//        if(age < 0 || age > 100) {
//            throw new IllegalArgumentException("Age must be between 0 and 100");
//        }
//        this.name = name;
//        this.age = age;
//    }

     public static class Builder{
        private String name;
        private int age;
        private String gender;
        private String major;
        private String course;
        private String phone;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setMajor(String major) {
            this.major = major;
            return this;
        }

        public Builder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public static Builder builder(){
        return new Builder();
    }

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.major = builder.major;
        this.course = builder.course;
        this.phone = builder.phone;
    }
}
