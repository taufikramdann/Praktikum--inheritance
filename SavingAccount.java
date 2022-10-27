 SavingAccount kelas  publik memperluas Akun {  
     tingkat bunga ganda  pribadi ;
     Rekening Tabungan publik () {
        super ();
    }
     Rekening Tabungan publik ( int nomor  rekening , double  interestRate ) {
        super ( nomor akun );
        ini . suku bunga = suku bunga ;
    }
     getInterestRate ganda  publik () {
        kembali  ini . suku bunga ;
    }

    public  void  setInterestRate ( double  interestRate ) {
        ini . suku bunga = suku bunga ;
    }

     kalkulasi ganda  publikInterest () {
        pengembalian  saldo * suku bunga ;
    }

    public  void  applyInterest () {
         bunga ganda = calcInterest ();
        Sistem . keluar . printf ( "Jumlah bunga %.2f ditambahkan ke saldo%n" , bunga );
        simpanan ( bunga );
    }
     setoran batal  publik ( jumlah ganda ) { 
        jika ( jumlah > 0 ) {
            saldo += jumlah ;
            Sistem . keluar . printf ( "Jumlah %.2f deposit%n" , jumlah );
            Sistem . keluar . printf ( "Saldo saat ini adalah: %.2f%n" , saldo );

        } lain {
            Sistem . keluar . println ( "Jumlah negatif tidak dapat disetorkan" );
        }
    }

     penarikan batal  publik ( jumlah ganda ) { 
        jika ( jumlah > 0 ) {
            // Periksa saldo yang cukup
            if (( jumlah ) <= saldo ) {
                Sistem . keluar . printf ( "Jumlah %.2f ditarik dari Akun%n" , jumlah );
                saldo -= jumlah ;
                Sistem . keluar . printf ( "Saldo saat ini adalah: %.2f%n" , saldo );
            }
        } lain {
            Sistem . keluar . println ( "Jumlah negatif tidak dapat ditarik!" );
        }
    }
}
