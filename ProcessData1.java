import java.util.Scanner;

class ProcessData1{
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        double amount, total;
        boolean taxable;

        System.out.print("Input amount : ");
        amount = masukan.nextDouble();

        System.out.print("Apakah taxable? (true/false) : ");
        taxable = masukan.nextBoolean();

        if (taxable){
            total = amount*1.05;
        } else {
            total = amount;
        }
        System.out.print("Total : ");
        System.out.println(total);
    }
}
