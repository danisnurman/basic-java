// Import class Scanner dari package java util
import java.util.Scanner;

class Purchase{
    double amount, total;
    boolean taxable;

    // Deklarasi method getAmount() dengan tipe data double
    double getAmount(){
        System.out.println(amount);
        return amount;
    }

    // Deklarasi method getTaxable() dengan tipe data double
    double getTaxable(){
        // Instansiasi objek Scanner
        Scanner masukan = new Scanner(System.in);

        System.out.print("Input amount : ");
        amount = masukan.nextDouble();

        System.out.print("Is taxable? (true/false) : ");
        taxable = masukan.nextBoolean();

        // Close scanner
        masukan.close();

        if(taxable){
            total=amount*1.05;
        } else {
            total=amount;
        }
        return total;
    }

    // Deklarasi method getTotal() dengan tipe data double
    double getTotal(){
        System.out.println("Total : "+total);
        return total;
    }
}

public class ProcessData2{
    public static void main(String[] args){
        // Instansiasi objek pemrosesan dari class Purchase
        Purchase pemrosesan = new Purchase();

        // Memanggil method getTaxable() dari objek pemrosesan
        pemrosesan.getTaxable();

        // Memanggil method getTotal() dari objek pemrosesan
        pemrosesan.getTotal();
    }
}
