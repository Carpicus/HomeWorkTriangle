import java.util.Scanner;

public class Main {
    public static void main(String[] name) {

        double a,b,c;
        Scanner scan = new Scanner(System.in);
        do {
        System.out.println("Введіть значення для першої сторони");
        a=  scan.nextDouble();
        System.out.println("Введіть значення для другої сторони");
        b = scan.nextDouble();
        System.out.println("Введіть значення для третьої сторони");
        c = scan.nextDouble();

        if((a+b<c) || (a+c<b) || (b+c<a)) {
            System.out.println("Помилка, будь-які дві сторини трикутника повинні бути більші за третю");
        }
    }while((a+b<c) || (a+c<b) || (b+c<a));

        Model m = new Model();
        m.s1 = a;
        m.s2 = b;
        m.s3 = c;
        m.s = m.s1 + m.s2 + m.s3;

        Controller con = new Controller();
        double result = con.calculate(m.s,m.s1, m.s2, m.s3);

        View v = new  View();
        v.display(result);

    }
}