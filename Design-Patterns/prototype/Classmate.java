package prototype;

class Address{
    private String street;
    private String city;
    private String state;

    public Address(){}

    Address(String street, String city, String state){
        this.street = street;
        this.city = city;
        this.state = state;
    }

    Address(Address address){
        this.street = address.street;
        this.city = address.city;
        this.state = address.state;
    }

    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
}

public class Classmate implements Prototype{
    private String name;
    private int age;
    private Address address;

    public Classmate(){}

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    /*
    * Shallow Copy constructor
    * */
//    public Classmate(Classmate classmate){
//        this.name = classmate.getName();
//        this.age = classmate.getAge();
//        this.address = classmate.getAddress();
//    }

    /*
    * Deep Copy constructor
    * */
    public Classmate(Classmate classmate){
        this.name = classmate.getName();
        this.age = classmate.getAge();
        this.address = new Address(classmate.getAddress());
    }

    @Override
    public Classmate clone(){
        return new Classmate(this);
    }
}
