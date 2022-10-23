
public class ID {
     public String nama = "Asnawi";
    private final int nip = 1500631011;
    public String jabatan = "Kepala Sekolah";    
    
    public void nama(){
        System.out.println("Nama : "+nama);        
    }
    
    public void nip(){
        System.out.println("Nip : "+nip);
    }
    
    public void jabatan(){
        System.out.println("Jabatan : "+jabatan);
    }
}


class Pegawai {

    public String nama;
    private final int gaji;

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int infoGaji() {

        return gaji;
    }
}



class Gaji extends ID{
    int g_pokok, t, t1, t2, t3;
    
    public void g_pokok(int gp){
        this.g_pokok = gp;
    }
    
    public int gGP(){
        return g_pokok;
    }
    
    public void t (int tj){
        this.t = tj;
    }
    
    public int gT(){
        return t;
    }
    
    public void t1(int tj1){
        this.t1 = tj1;
    }
    
    public int gT1(){
        return t1;
    }
    
    public void t2(int tj2){
        this.t2 = tj2;
    }
    
    public int gT2(){
        return t2;
    }
    
    public void t3(int tj3){
        this.t3 = tj3;
    }
    
    public int gT3(){
        return t3;
    }   
}


class JumlahGaji extends Gaji{
    double all;
    
    public void gaji(){
        JumlahGaji jumlahgaji = new JumlahGaji();
        jumlahgaji.g_pokok(1800000);
        jumlahgaji.t(400000);
        jumlahgaji.t1(300000);
        jumlahgaji.t2(200000);
        jumlahgaji.t3(100000);
        
        System.out.println("Gaji Pokok \t : Rp. "+jumlahgaji.gGP() +",-");
        System.out.println("Gaji Tunjangan 1 \t : Rp. "+jumlahgaji.gT1()  +",-");
        System.out.println("Gaji Tunjangan 2 \t : Rp. "+jumlahgaji.gT2() +",-");
        System.out.println("Gaji Tunjangan 3 \t : Rp. "+jumlahgaji.gT3() +",-");
        System.out.println("Gaji Tunjangan 4 \t : Rp. "+jumlahgaji.gT() +",-");  
        
        all = (double) jumlahgaji.gGP()  + jumlahgaji.gT1() + jumlahgaji.gT2() + jumlahgaji.gT3() + jumlahgaji.gT(); 
    }
    
    public double all(){
        return all;
    }
}


class Main extends JumlahGaji {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(" Gaji Dan Tunjangan Guru");
        System.out.println("-------------------------------------------");
        main.nip();
        main.nama();
        main.jabatan();
        main.gT();
        main.gaji();
        System.out.println("-------------------------------------------");
        System.out.println("Total Gaji Poko + Tunjangan : Rp. "+main.all()+",-");
        
    }
}