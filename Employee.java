impor  jawa . util . Tanggal ;

 Karyawan kelas  publik {
    private  static  final  double  BASE_SALARY = 15000.00 ;
     Nama String  pribadi = "" ;
     Gaji ganda  pribadi = 0,0 ;
    pribadi  Tanggal  lahirTanggal ;
   
     Pegawai publik ( String  nama , gaji ganda  , Tanggal DoB ){ 
        ini . Nama = nama ;
        ini . Gaji = gaji ;
        ini . tanggal lahir = DoB ;
}
     Pegawai publik ( String  nama , gaji ganda  ){
        ini ( nama , gaji , nol );
}
     Pegawai publik ( String  nama , Tanggal  DoB ){
        ini ( nama , BASE_SALARY , DoB );
}
     Pegawai publik ( Nama string  ){
        ini ( nama , BASE_SALARY );
        
}
    publik  String  GetName (){ kembali  Nama ;}
    publik  ganda  GetSalary (){ kembali  Gaji ; }
    public  Date  GetbirthDate (){ return  birthDate ; }
}
class  Manager  memperluas  Karyawan {
//tambahan atribut untuk manajer kelas
     departemen String  pribadi ;

     Manajer publik ( Nama string  , gaji ganda , Tanggal DoB ) {  
        super ( nama , gaji , DoB );
    }
     Manajer publik ( String  n , String  dept ){
        super ( n );
        departemen = departemen ;
}
     Manajer publik ( String  dept , int  par , String  financial ){
        super ( dept );
        departemen = departemen ;
}
    publik  String  GetDept (){
         departemen pengembalian ;
}
}

 kelas  TestManager {
    public  static  void  main ( String [] args ) {
        Manajer  Utama = Manajer baru  ( "John" , "Keuangan" );
        Sistem . keluar . println ( "Nama:" + Utama . GetName ());
        Sistem . keluar . println ( "Gaji:" + Utama . GetSalary ());
        Sistem . keluar . println ( "Jurusan:" + Utama . GetDept ());
        
        Utama = Manajer baru  ( "Michael" , "Akuntansi" );
        Sistem . keluar . println ( "Nama:" + Utama . GetName ());
        Sistem . keluar . println ( "Gaji:" + Utama . GetSalary ());
        Sistem . keluar . println ( "Jurusan:" + Utama . GetDept ());
}
}
