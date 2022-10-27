kelas  Induk {
     int  publik x = 5 ;
}
kelas  Anak  memperluas  Induk {
     int  publik x = 10 ;
     Info kekosongan  publik ( int x ) { 
        Sistem . keluar . println ( "Nilai x sebagai parameter = " + x );
        Sistem . keluar . println ( "Data member x di class Anak = " + this .x ) ;
        Sistem . keluar . println ( "Data member x di class Induk = " + super .x ) ;
}
}
 kelas  publik Percobaan1 {
    public  static  void  main ( String  args []) {
         Tes anak = Anak baru  ();
        tes . Informasi ( 20 );
}
}
