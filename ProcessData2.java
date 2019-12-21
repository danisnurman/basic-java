// Import class Scanner dari package util
import java.util.Scanner;

class Purchase{
    // Deklarasi variabel
    double amount, total;
    boolean taxable;

    // Deklarasi method getAmount() dengan tipe data double
    double getAmount(){
        // Cetak amount
        System.out.println(amount);
        return amount;
    }

    // Deklarasi method isTaxable() dengan tipe data double
    double isTaxable(){
        // Instansiasi objek masukan dari class Scanner
        Scanner masukan = new Scanner(System.in);

        // Input besar amount, lalu simpan data di dalam variabel amount bertipe data double
        System.out.print("Input amount : ");
        amount = masukan.nextDouble();

        // Input amount true/false, lalu simpan data di dalam variabel taxable bertipe data boolean
        System.out.print("Is taxable? (true/false) : ");
        taxable = masukan.nextBoolean();

        // Close scanner
        masukan.close();

        if(taxable){
            // Jika kondisi taxable=true
            total=amount*1.05;
        } else {
            // Jika kondisi taxable=false
            total=amount;
        }
        return total;
    }

    // Deklarasi method getTotal() dengan tipe data double
    double getTotal(){
        // Cetak total, nilai total diambil dari operasi pada method isTaxable()
        System.out.println("Total : "+total);
        return total;
    }
}

public class ProcessData2{
    public static void main(String[] args){
        // Instansiasi objek pemrosesan dari class Purchase
        Purchase pemrosesan = new Purchase();

        // Memanggil method isTaxable() dari objek pemrosesan
        pemrosesan.isTaxable();

        // Memanggil method getTotal() dari objek pemrosesan
        pemrosesan.getTotal();
    }
}
