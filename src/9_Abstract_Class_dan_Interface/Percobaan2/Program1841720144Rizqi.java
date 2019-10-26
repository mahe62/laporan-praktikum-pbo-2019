/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author ASUS
 */
public class Program1841720144Rizqi {

    public static void main(String[] args) {
        Rektor1841720144Rizqi pakRektor = new Rektor1841720144Rizqi();
        Mahasiswa1841720144Rizqi mahasiswaBiasa = new Mahasiswa1841720144Rizqi("Charlie");
        Sarjana1841720144Rizqi sarjanaCumlaude = new Sarjana1841720144Rizqi("Dini");
        PascaSarjana1841720144Rizqi masterCumlaude = new PascaSarjana1841720144Rizqi("Elok");
        
        pakRektor.BeriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.BeriSertifikatCumlaude(masterCumlaude);
     
    }

}
