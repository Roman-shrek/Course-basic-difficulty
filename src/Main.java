public class Main {
    public static Employee[] employee = new Employee[10];

    // Метод вывода сотрудников
    public static void printEmployee() {
        for (int i = 0; i < employee.length; i++) {
            if (employee != null) {
                System.out.println(employee[i] + "Id - "+ employee[i].id);
            }
        }
    }
    // Метод для подсчета суммы затрат на зарплату сотрудников
    public static void printSumCostSallary() {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {

                sum = sum + employee[i].getSallary();
            }
        }
        System.out.println("Общая сумма затрат на зарплату " + sum);

    }

    // Метод для определения сотрудника с минимальной зарплатой
    public static void printMinSallaryEmployee() {
        Employee minSallary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && minSallary.getSallary() > employee[i].getSallary()) {
                minSallary = employee[i];
            }
        }
        System.out.println("Минимальная зарплата: " + minSallary + " Id - " + minSallary.id);
    }

    // Метод для поиска сотрудника с максимальной зарплатой
    public static void printMaxSallaryEmployee() {
        Employee maxSallary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && maxSallary.getSallary() < employee[i].getSallary()) {
                maxSallary = employee[i];
            }
        }
        System.out.println("Максимальная зарплата: " + maxSallary + " Id - " + maxSallary.id);
    }

    // Метод для подсчета средней зарплаты
    public static void averageSalary() {
        int avarge = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                avarge = avarge + employee[i].getSallary();
            }
        }
        System.out.println("Средняя Зарплата " + avarge / employee.length);
    }

    // Метод для вывода ФИО
    public static void printNameEmployee() {
        for (int i = 0; i < employee.length; i++) {
            if (employee != null) {
                System.out.println(employee[i].getNameEmployee());
            }
        }
    }

    public static void main(String[] args) {
        employee[0] = new Employee("Иванов Алексей Сергеевич", 65_000, 1);
        employee[1] = new Employee("Крутов Роман Сергеевич", 70_000, 5);
        employee[2] = new Employee("Тихонов Семен Павлович", 87_000, 1);
        employee[3] = new Employee("Дмитриев Егор Олегович", 8_000, 3);
        employee[4] = new Employee("Смиронов Игорь Романович", 74_000, 2);
        employee[5] = new Employee("Денисов Сергей Валерьевич", 72_000, 1);
        employee[6] = new Employee("Кириллов Артем Валерьевич", 47_000, 1);
        employee[7] = new Employee("Павленко Павел Анатольевич", 20_000, 4);
        employee[8] = new Employee("Ильин Игорь Петрович", 30_000, 4);
        employee[9] = new Employee("Гришин Алексей Васильевич", 108_000, 1);
        // Использую метод toString и печатаю весь список
        System.out.println("Распечатываю всех сотрудников");
        printEmployee();
        System.out.println();
        // Узнаю сумму затрат на Зарплату сотрудника
        System.out.println("Сумма затрат на зарплату");
        printSumCostSallary();
        System.out.println();

        System.out.println("Сотрудник с минмальной зарплатой");
        // Узнаем у какого сотрудника минимальная зарплата
        printMinSallaryEmployee();
        System.out.println();

        // Узнаем у какого сотрудника максимальная зарплата
        System.out.println("Сотрудник с максимальной зарплатой");
        printMaxSallaryEmployee();
        System.out.println();

        System.out.println("Средняя зарплата");
        // Узнаем среднюю зарплату среди сотрудников
        averageSalary();
        System.out.println();

        System.out.println("Список пофамильный");
        // Выведем список сотрудников
        printNameEmployee();
    }
}

