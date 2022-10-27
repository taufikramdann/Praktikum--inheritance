 kelas  publik KelasB   memperluas  KelasA {
    KelasB (){
        Sistem . keluar . println ( "Konstruktor B dijalankan " );
        var_a = "Var_a dari kelas B" ;
        var_b = "Var_a dari kelas B" ;
        var_c = "Var_a dari kelas B" ;
        var_d = "Var_a dari kelas B" ;
    }
    public  static  void  main ( String  args []){
        Sistem . keluar . println ( "Objek A dibuat" );
        KelasA  aa = KelasA baru  ();
        Sistem . keluar . println ( "menampilkan nama variabel obyek aa" );
        Sistem . keluar . println ( aa .var_a ) ;
        Sistem . keluar . println ( aa .var_b ) ;
        Sistem . keluar . println ( aa .var_c ) ;
        Sistem . keluar . println ( aa .var_d ) ;
        Sistem . keluar . println ( "" );
        
        Sistem . keluar . println ( "Objek B dibuat" );
        KelasB  bb = KelasB baru  ();
        Sistem . keluar . println ( "menampilkan nama variabel obyek bb" );
        Sistem . keluar . println ( bb .var_a ) ;
        Sistem . keluar . println ( bb .var_b ) ;
        Sistem . keluar . println ( bb .var_c ) ;
        Sistem . keluar . println ( bb .var_d ) ;
}
}
