import java.util.Scanner;
public class AtletCabor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        System.out.print("Masukkan jumlah Politeknik yang mengikuti: ");
        int N = sc.nextInt();
        sc.nextLine();
        
        for (int z=1; z <= N; z++) {
            System.out.print("Masukkan nama Politeknik ke-"+z+" : ");
            String politeknik = sc.nextLine();
            System.out.println();
            System.out.println("== Daftar Atlet Cabor ==");
            System.out.println("-- Nama atlet cabang badminton --");
            for ( int j=1; j < 6; j++) {
                System.out.print("Nama atlet ke-"+j+" : ");
                String badminton = sc.nextLine();    
            }
            System.out.println();
            System.out.println("-- Nama atlet cabang olahraga tenis meja --");
            for (int y=1; y < 6; y++) {
                System.out.print("Nama atlet ke-"+y+" : ");
                String tenisMeja = sc.nextLine();
            }
            System.out.println();
            System.out.println("-- Nama atlet cabang olahraga basket --");
            for (int f=1; f < 6; f++) {
                System.out.print("Nama atlet ke-"+f+" : ");
                String basket = sc.nextLine(); 
            }
            System.out.println();
            System.out.println("-- Nama atlet cabang olahraga bola voli --");
            for (int w=1; w < 6; w++ ) {
                System.out.print("Nama atlet ke-"+w+" : ");
                String bolaVoli = sc.nextLine();
            }
            System.out.println();
        } i++;   
        System.out.println("== Terimakasih telah mengikuti Nasional Porseni ==");
    }
}