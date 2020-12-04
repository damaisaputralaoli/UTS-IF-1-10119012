package uts.pkgif.pkg1.pkg101190.damai.saputra.laoli.no.pkg3;

/**
   NAMA  : DAMAI SAPUTRA LAOLI
   KELAS : IF-1
   NIM   : 10119012
 */

public class Rnb extends MusicGenre implements Blues, Jazz {
    public void genreJazz(String artistName){
        System.out.println(artistName + " adalah musisi Jazz");
    }

    public void genreBlues(String artistName){
        System.out.println(artistName + " adalah musisi Blues");
    }
}
