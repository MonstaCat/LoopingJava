package pkg1tid_andikarizkipradana;

import javax.swing.JOptionPane;

public class program16_LatihanLooping {
    public static void main(String[] args) {
        
        int i, x, nAwal = 0, nAkhir = 0;
        String a = "Bilangan ";
        String b = "Bilangan ";
        
        nAwal  = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Awal: "));
        nAkhir = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Akhir: "));
        
        for(i=nAwal; i<nAkhir; i++){
            if(i%2==0){
                x = i*i; 
                a += x+" ";
            } else if(i%2==1){
                x = i*i;
                b += x+" ";
            }
        }
        JOptionPane.showMessageDialog(null, a + "Genap\n" +b+ "Ganjil");
    }
}
