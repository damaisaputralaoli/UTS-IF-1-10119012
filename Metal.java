package uts.pkgif.pkg1.pkg101190.damai.saputra.laoli.no.pkg3;

/**
 * @author NAMA     : DAMAI SAPUTRA LAOLI
 * KELAS    : IF 1
 * NIM      : 10119012
 */

public class Metal implements HeavyMetal  {
    public void genreMetal(String artistName){
        System.out.println(artistName + " adalah musisi Metal");
    }

    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName + " adalah musisi HeavyMetal");
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName + " adalah musisi Punk");
    }

    public void genreGrunge(String artistName){
        System.out.println(artistName + " adalah musisi Grunge");
    }
}
