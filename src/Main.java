import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kurs kurs = new Kurs("KURS :IT KG", 222828243, "Djiparisa", 1997);
        System.out.println(kurs.name + "\n" + kurs.nomer + "\n" + kurs.nik + "\n" + kurs.godvypuska + "\n");


        Student student = new Student(21, "Azamat Rahmankulov");
        System.out.println("Uchenik" + "\n" + student.dr + "\n" + student.name + "\n" + "Жашынызды жазыныз");
        int a = scanner.nextInt();
        if (a >= 18) {
            System.out.println("Кош келиниз");
        } else {
            System.out.println("Сиздин жашыныз жетпейт");


//        Pramaugolnik pramaugolnik = new Pramaugolnik("Uch burchtuk",3,"15cm");
//        System.out.println(pramaugolnik.name+"\n"+pramaugolnik.storony+"\n"+pramaugolnik.dlina);

        }
    }
}