import java.util.Scanner;

class Truk{
    double muatan, muatanMax;
    
    Truk(double beratMax){
        this.muatanMax = beratMax;
    }

    double getMuatan(){
        System.out.println("TOTAL MUATAN = "+muatan);
        return muatan;
    }

    double getMuatanMax(){
        return muatanMax;
    }

    String tambahMuatan(double berat){
        if(muatan<=muatanMax){
            muatan += berat;
            return "";
        } else {
            double sisaMuatan = muatan-muatanMax;
            System.out.println("\nTruk kelebihan muatan sebesar : "+sisaMuatan);
            return "TIDAK BISA MENAMBAH MUATAN KARENA MELEBIHI BATAS MAKSIMAL\n";
        }
    }
}

public class MuatanTrukv2{
    public static void main(String[] args){
        Truk truk = new Truk(1000);
        System.out.print("\n========================");
        System.out.println("\nMuatan maksimal = "+truk.getMuatanMax());
        System.out.println("========================");

        for (int i=1; i<=4; i++){
            if(truk.muatan<=truk.muatanMax){
                System.out.print("Masukkan muatan truk : ");
                Scanner masukanMuatan = new Scanner(System.in);
                double muatanInData = masukanMuatan.nextDouble();
                
                truk.tambahMuatan(muatanInData);
            }
        }

        truk.getMuatan();
        System.out.println(truk.tambahMuatan(truk.muatan));
    }
}