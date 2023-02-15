public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setTitle("Mr.");
        employee1.setFirstName("Yarid");
        employee1.setSurname("Contreras");

        System.out.println(employee1.getMailingName());
        System.out.println(employee1.getMailingName(true));
        System.out.println(employee1.getMailingName(false));

        Employee employee2 = new Employee(2, "Manager");

        Department financeDept = new Department("Finance", "Sally Green");

        AltDepartment personnelDept = new AltDepartment("Personnel", "Bill Purple");
    }
}
