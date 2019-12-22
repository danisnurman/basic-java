// Import class Scanner dari package java util
import java.util.Scanner;

class Purchase{
    double amount, total;
    boolean taxable;

    double getUserInput(){
        Scanner masukan = new Scanner(System.in);

        System.out.print("Input amount : ");
        amount = masukan.nextDouble();

        System.out.print("Apakah taxable? (true/false) : ");
        taxable = masukan.nextBoolean();

        // Close scanner
        masukan.close();
        
        return amount;
    }

    double getIfTaxable(){
        if(taxable){
            total=amount*1.05;
        } else {
            total=amount;
        }
        return total;
    }

    double getTotal(){
        System.out.println("Total : "+total);
        return total;
    }
}

public class ProcessData2{
    public static void main(String[] args){
        // Instansiasi objek pemrosesan dari class Purchase
        Purchase pemrosesan = new Purchase();

        // Memanggil method getUserInput() dari objek pemrosesan
        pemrosesan.getUserInput();

        // Memanggil method getIfTaxable() dari objek pemrosesan
        pemrosesan.getIfTaxable();

        // Memanggil method getTotal() dari objek pemrosesan
        pemrosesan.getTotal();
    }
}
