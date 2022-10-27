impor  jawa . util . Pemindai ;

 Akun kelas abstrak  publik { 
     nomor akun int  pribadi ;
     keseimbangan ganda yang  dilindungi ;
     Akun publik () {

    }
     Akun publik ( int  nomor akun ) {
        ini . akunNumber = akunNumber ;
        saldo = 0 ;
    }
     getBalance ganda  publik () {
        kembali  ini . keseimbangan ;
    }

    public  int  getAccountNumber () {
        kembali  ini . nomor akun ;
    }
     setoran batal abstrak  publik ( jumlah ganda );  

     penarikan abstrak  publik ( jumlah ganda ) ;  
    public  static  void  main ( String [] args ) {

         Keyboard pemindai = Pemindai baru  ( System . in );
        Akun  akun [] = Akun baru  [ 10 ];
        int  jumlahAkun = 0 ;

         pilihan int ;

        lakukan {
            pilihan = menu ( keyboard );
            Sistem . keluar . println ();
            
            jika ( pilihan == 1 ) {
                akun [ numAccounts ++] = createAccount ( keyboard );
            } else  if ( pilihan == 2 ) {
                doDeposit ( akun , numAccounts , keyboard );
            } else  if ( pilihan == 3 ) {
                doWithdraw ( akun , numAccounts , keyboard );
            } else  if ( pilihan == 4 ) {
                applyInterest ( akun , numAccounts , keyboard );
            } lain {
                Sistem . keluar . println ( "Selamat tinggal!" );
            }
            Sistem . keluar . println ();
        } while ( pilihan != 5 );
    }

    public  static  int  accountMenu ( Keyboard pemindai  ) {
        Sistem . keluar . println ( "Pilih Jenis Akun" );
        Sistem . keluar . println ( "1. Rekening Giro" );
        Sistem . keluar . println ( "2. Rekening Tabungan" );

         pilihan int ;
        lakukan {
            Sistem . keluar . print ( "Masukkan pilihan : " );
            pilihan = papan ketik . nextInt ();
        } while ( pilihan < 1 || pilihan > 2 );
        
         pilihan kembali ;
    }

    public  static  int  searchAccount ( Account  account [], int  count , int  accountNumber ) {

        untuk ( int  i = 0 ; i < hitung ; i ++) {
            if ( akun [ i ]. getAccountNumber () == akunNumber ) {
                kembali  saya ;
            }
        }

        kembali - 1 ;
    }
    public  static  void  doDeposit ( Akun  akun [], jumlah int  , Keyboard pemindai ) { 
        
        Sistem . keluar . print ( "\nSilakan masukkan nomor rekening: " );
        int  nomor akun = keyboard . nextInt ();

        
        int  index = searchAccount ( akun , hitungan , akunNumber );

        jika ( indeks >= 0 ) {
        
            Sistem . keluar . print ( "Masukkan Jumlah Deposit : " );
             jumlah ganda = keyboard . berikutnyaDouble ();

            akun [ indeks ]. setoran ( jumlah );
        } lain {
            Sistem . keluar . println ( "Tidak ada akun dengan AccountNumber: " + akunNumber );
        }
    }

    public  static  void  doWithdraw ( Akun  akun [], jumlah int  , Keyboard pemindai ) { 

        Sistem . keluar . print ( "\nSilakan masukkan nomor rekening: " );
        int  nomor akun = keyboard . nextInt ();

 
        int  index = searchAccount ( akun , hitungan , akunNumber );

        jika ( indeks >= 0 ) {
      
            Sistem . keluar . print ( "Masukkan Jumlah Penarikan : " );
             jumlah ganda = keyboard . berikutnyaDouble ();
            akun [ indeks ]. menarik ( jumlah );
        } lain {
            Sistem . keluar . println ( "Tidak ada akun dengan AccountNumber: " + akunNumber );
        }
    }

    public  static  void  applyInterest ( Akun  akun [], jumlah int  , Keyboard pemindai ) { 
        
        Sistem . keluar . print ( "\nSilakan masukkan nomor rekening: " );
        int  nomor akun = keyboard . nextInt ();

       
        int  index = searchAccount ( akun , hitungan , akunNumber );

        jika ( indeks >= 0 ) {
            
            if ( akun [ indeks ] instanceof  SavingAccount ) {
                (( SavingAccount ) akun [ indeks ]). terapkanMinat ();
            }
        } lain {
            Sistem . keluar . println ( "Tidak ada akun dengan AccountNumber: " + akunNumber );
        }
    }

  
    publik  Akun  statis createAccount ( Keyboard pemindai  ) {

        Akun  akun = null ;
        ke dalam  pilihan = akunMenu ( keyboard );

        int  nomor akun ;
        Sistem . keluar . print ( "Masukkan Nomor Rekening : " );
        nomor akun = keyboard . nextInt ();

        if ( pilihan == 1 ) { // cek akun
            Sistem . keluar . print ( "Masukkan Biaya Transaksi : " );
            dobel biaya = keyboard . berikutnyaDouble ();
            Akun = new  CheckingAccount ( nomor akun , biaya );
        } lain { // Rekening tabungan
            
            Sistem . keluar . print ( "Silahkan masukkan Suku Bunga : " );
            dobel ir = keyboard . berikutnyaDouble ();
            Akun = baru  SavingAccount ( nomor rekening , ir );
        }
        kembali  akun ;
    }

     menu int statis  publik  ( Keyboard pemindai  ) {
        Sistem . keluar . println ( "Menu Rekening Bank" );
        Sistem . keluar . println ( "1. Buat Akun Baru" );
        Sistem . keluar . println ( "2. Deposit Dana" );
        Sistem . keluar . println ( "3. Tarik Dana" );
        Sistem . keluar .println ( "4. Ajukan Minat" );
        Sistem . keluar . println ( "5. Keluar" );

         pilihan int ;

        lakukan {
            Sistem . keluar . mencetak ( "Masukkan pilihan : " );
            pilihan =papan ketik . nextInt ();
        } while ( pilihan < 1 || pilihan > 5 );

        kembali pilihan  ;
    }
}
