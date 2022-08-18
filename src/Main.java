public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "ivan";
        String middleName = "ivanovich";
        String lastName = "ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника -" + fullName);

       //Задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета -" + fullName.toUpperCase());

        //Задание 3
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.contains("ё"));
        System.out.println("Данные ФИО сотруднка -" + fullName.replace("ё", "е"));


    }
}