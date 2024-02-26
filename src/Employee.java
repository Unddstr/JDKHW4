public class Employee {
    private static int count = 0;
    private int number;
    private String phoneNumber;
    private String name;
    private int experience;

    public Employee(String phoneNumber, String name, int experience) {
        count++;
        this.number = count;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getNumber() {
        return number;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + number +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                "}";
    }
}
