public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();

        directory.addEmployee(new Employee("564", "e1", 5));
        directory.addEmployee(new Employee("234", "e2", 2));
        directory.addEmployee(new Employee("358", "e3", 2));
        directory.addEmployee(new Employee("456", "e2", 1));
        System.out.println(directory.findExperience(2));
        System.out.println(directory.findPhoneNumberByName("e2"));
        System.out.println(directory.findEmployeeByNumber(4));
    }
}