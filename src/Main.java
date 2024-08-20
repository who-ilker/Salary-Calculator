import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Employee e1 = new Employee("Kemal", 2000.0, 45, 1985);
        e1.printInfo(e1);

        Employee e2 = new Employee("ilk", 1000.0, 45, 2020);
        e2.printInfo(e2);


    }
}
