 CheckingAccount kelas  publik memperluas Akun {  

    // Biaya Transaksi Default
     BIAYA ganda statis  pribadi = 2,5 ; 

    // konstruktor default
     Akun Cek publik () {
        super ();
    }
    
     Rekening Cek publik ( int  nomor rekening , biaya ganda  ) {
        super ( nomor akun );
        BIAYA = biaya ;
    }

    @ Ganti
     setoran batal  publik ( jumlah ganda ) { 

        jika ( jumlah > 0 ) {
            saldo += jumlah ;
            Sistem . keluar . printf ( "Jumlah %.2f deposit%n" , jumlah );
            saldo -= BIAYA ;
            Sistem . keluar . printf ( "Biaya %.2f Berlaku%n" , BIAYA );
            Sistem . keluar . printf ( "Saldo saat ini adalah: %.2f%n" , saldo );
            
        } lain {
            Sistem . keluar . println ( "Jumlah negatif tidak dapat disetorkan" );
        }
    }
    @ Ganti
     penarikan batal  publik ( jumlah ganda ) { 
        jika ( jumlah > 0 ) {
          
            if (( jumlah + BIAYA ) <= saldo ) {

                Sistem . keluar . printf ( "Jumlah %.2f ditarik dari Akun%n" , jumlah );
                saldo -= jumlah ;
                saldo -= BIAYA ;
                Sistem . keluar . printf ( "Biaya %.2f diterapkan%n" , BIAYA );
                Sistem . keluar . printf ( "Saldo saat ini adalah: %.2f%n" , saldo );
            }
        } lain {
            Sistem . keluar . println ( "Jumlah negatif tidak dapat ditarik!" );
        }
    }
}
