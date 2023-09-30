package Pages;

public class LoginPage implements TestCompletion{
    public static void main(String[] args) {
        SignUpPage signUpPage1 =new SignUpPage();
        SignUpPage signUpPage2 =new SignUpPage();

        System.out.println("Hello automation");
        int age = 128;
        String name = "Morenikeji Daniel Yinka";
        String department = "Testing";
        System.out.println(name + department + "training");

        // ++ is used to increment a value
        int i = 10;
        System.out.println(i++);

        int j = 20;
        int sum = j++;
        System.out.println(sum);

        double cgpa = 3.9;

        char grades = 'A';
    }
}
