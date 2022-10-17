
public class Employee {

    private String name;
    private int salary;
    private int workHours;
    private int hireYear;


    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public float tax() {

        if(salary > 1000) {

            return salary*0.03f;
        }else {
            return 0;
        }

    }

    public int bonus() {

        if(workHours > 40) {
            return (workHours - 40 ) * 30 * 4; // 1 aylik (4 hafta olarak)
        }else {
            return 0;
        }
    }

    public float raiseSalary() {

        int diffYear = Math.abs(hireYear - 2021);
        int totalSalary = totalSalary();
        float tax = tax();

        if(diffYear < 10) {

            return (totalSalary - tax) * 0.05f;
        }
        else if(diffYear > 9 && diffYear < 20) {

            return (totalSalary-tax) * 0.10f;
        }
        else {

            return (totalSalary-tax) * 0.15f;
        }
    }

    public int totalSalary() {

        return salary + bonus()  ;
    }


    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear=" + hireYear + "]"
                + "\nuygulanan vergi=" + tax() + "\n" + "bonus=" + bonus() +  "\n" + "maas artisi=" + raiseSalary() + "\n"
                + "vergi ve bonuslarla birlikte maas=" + (totalSalary() - tax()) + "\n" + "toplam maas=" + totalSalary() ;
    }



}
