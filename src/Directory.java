import java.util.*;

public class Directory {
    private final Set<Employee> set = new HashSet<>();

    public void addEmployee(Employee employee) {
        this.set.add(employee);
    }

    public List<Employee> findExperience(int experience) {
        List<Employee> resultList = new ArrayList<>();
        for (Employee e : set) {
            if (e.getExperience() == experience) {
                resultList.add(e);
            }
        }
        return resultList;
    }

    public List<String> findPhoneNumberByName(String name) {
        List<String> resultList = new ArrayList<>();
        for (Employee e : set) {
            if (Objects.equals(e.getName(), name)) {
                resultList.add(e.getPhoneNumber());
            }
        }
        return resultList;
    }

    public Employee findEmployeeByNumber(int number) {
        for (Employee e : set) {
            if (e.getNumber() == number) {
                return e;
            }
        }
        return null;
    }
}
