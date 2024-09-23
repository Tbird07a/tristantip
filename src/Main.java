import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner name = new Scanner(System.in);
        System.out.print("Enter your Bill($):  ");
        String bill = name.nextLine();


        Scanner name1 = new Scanner(System.in);
        System.out.print("Tip Percent:  ");
        String tip = name1.nextLine();


        Scanner name2 = new Scanner(System.in);
        System.out.print("Enter number of people:  ");
        String people = name2.nextLine();


        double billa = Double.parseDouble(bill);
        double tipa = Double.parseDouble(tip);
        double peoplea = Double.parseDouble(people);


        tipa = billa * (tipa / 100);
        double total = billa + tipa;
        double tip_per_person = tipa / peoplea;
        double total_per_person = total / peoplea;


        System.out.println("--------------");
        System.out.print("| Total Tip Amount: ");
        System.out.format("%.2f", tipa);
        System.out.println();
        System.out.println("--------------");
        System.out.print("| Total bill cost: " );
        System.out.format("%.2f", total);
        System.out.println();
        System.out.println("--------------");
        System.out.print("| Tip per person: " );
        System.out.format("%.2f", tip_per_person);
        System.out.println();
        System.out.println("--------------");
        System.out.print("| Total bill per person: " );
        System.out.format("%.2f", total_per_person);


    }}

