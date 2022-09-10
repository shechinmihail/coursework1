package coursework1;


import java.util.Arrays;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee empl1 = new Employee("Petrov ", "Petr ", "Petrovich ", 1, 500000);
        Employee empl2 = new Employee("Ivanov ", "Ivan ", "Ivanovich ", 2, 255000);
        Employee empl3 = new Employee("Nikolaev ", "Nikolai ", "Nirolaevich ", 3, 355000);
        Employee empl4 = new Employee("Mihailov ", "Mihail ", "Mihailovich ", 4, 405000);
        Employee empl5 = new Employee("Aleksandrov ", "Aleksandr ", "Aleksandrovich ", 5, 175000);
        Employee empl6 = new Employee("Popova ", "Anna ", "Pavlovna ", 4, 365000);
        Employee empl7 = new Employee("Sergeeva ", "Kristina ", "Sergeevna ", 5, 180000);

        employees[0] = empl1;
        employees[1] = empl2;
        employees[2] = empl3;
        employees[3] = empl4;
        employees[4] = empl5;
        employees[5] = empl6;
        employees[6] = empl7;

        Arrays.stream(employees).forEach(System.out::println);

        printAllEmployees();
        monthlyAmount();
        employeeMaxSalary();
        employeeMinSalary();
        averageSalary();
        printFullNameEmployees();
        indexationSalary(5);
        minSalaryInDepartment(4);
        maxSalaryInDepartment(5);
        departmentalPayrollCosts(5);
        averageSalaryInDepartment(4);
        indexationSalaryInDepartment(5, 5);
        printAllEmployeesInDepartment(4);
        employeeLessSalary(250000);
        employeeMoreSalary(250000);


    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    public static void monthlyAmount() {
        int summ = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                summ += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в месяц: " + summ + " рублей.");
    }

    public static void employeeMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary + " рублей.");
    }

    public static void employeeMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();

            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary + " рублей.");
    }

    public static void averageSalary() {
        int peopleCount = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                peopleCount++;
            }
        }
        System.out.println("Средняя зарплата сотрудников: " + sum / peopleCount + " рублей.");
    }

    public static void printFullNameEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Ф.И.О. всех сотрудников: " + employee.getSurName() + employee.getFirstName()
                        + employee.getMiddleName());
            }
        }
    }

    // Повышенная сложность

    /**
     * Создать дополнительные статические методы для решения следующих задач.
     * 1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
     * 2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
     * a. Сотрудника с минимальной зарплатой.
     * b. Сотрудника с максимальной зарплатой.
     * c. Сумму затрат на зарплату по отделу.
     * d. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
     * e. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
     * f. Напечатать всех сотрудников отдела (все данные, кроме отдела).
     * 3. Получить в качестве параметра число и найти:
     * a. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
     * b. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
     */

    public static void indexationSalary(int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                int increaseSalary = (int) (employee.getSalary() * (percent / 100f * 1) + employee.getSalary());
                employee.setSalary(increaseSalary);
                System.out.println(increaseSalary);
            }
        }
    }

    public static void minSalaryInDepartment(int department) {
        double minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        if (result != null) {
            System.out.println("Сотрудник отдела № " + department + " с минимальной зарплатой: "
                    + result.getSurName() + result.getFirstName() + result.getMiddleName());
        }
    }

    public static void maxSalaryInDepartment(int department) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        if (result != null) {
            System.out.println("Сотрудник отдела № " + department + " с максимальной зарплатой: " + result.getSurName()
                    + result.getFirstName() + result.getMiddleName());
        }
    }

    public static void departmentalPayrollCosts(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумму затрат на зарплату по отделу № " + department + " составляет: "
                + sum + " рублей.");
    }

    public static void averageSalaryInDepartment(int department) {
        int peopleCount = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
                peopleCount++;
            }
        }
        System.out.println("Средняя зарплата сотрудников отдела № " + department + " составляет: "
                + sum / peopleCount + " рублей.");
    }

    public static void indexationSalaryInDepartment(int percent, int dapartment) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == dapartment) {
                int increaseSalary = (int) (employee.getSalary() * (percent / 100f * 1) + employee.getSalary());
                employee.setSalary(increaseSalary);
                System.out.println(increaseSalary);
            }
        }
    }

    public static void printAllEmployeesInDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("Id " + employee.getId() + " Фамилия " + employee.getSurName() +
                        " Имя " + employee.getFirstName() + " Отчество " + employee.getMiddleName() +
                        " Зарплата " + employee.getSalary());
            }
        }
    }

    public static void employeeLessSalary(int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("Сотрудники с с зарплатой меньше " + salary + " рублей Id " + employee.getId()
                        + " Фамилия " + employee.getSurName() + " Имя " + employee.getFirstName() + " Отчество "
                        + employee.getMiddleName() + " Зарплата " + employee.getSalary());
            }
        }
    }

    public static void employeeMoreSalary(int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salary) {
                System.out.println("Сотрудники с зарплатой больше (или равно) " + salary + " рублей Id "
                        + employee.getId() + " Фамилия " + employee.getSurName() + " Имя " + employee.getFirstName()
                        + " Отчество " + employee.getMiddleName() + " Зарплата " + employee.getSalary());
            }
        }
    }

}








