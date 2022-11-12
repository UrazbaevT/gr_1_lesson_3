import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите имя для авторизации: ");
            String name = scanner.next();

            try {
                user.setName(name);
                System.out.println("Успешно. Ваше имя " + user.getName());
            }catch (IllegalNameException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Введите возраст для авторизации: ");
            Integer age = scanner.nextInt();
            try {
                user.setAge(age);
                System.out.println("Успешно. Ваш возраст " + user.getAge());
            }catch (IllegalAgeException ie){
                System.out.println(ie.getMessage());
            }
        }
    }
}