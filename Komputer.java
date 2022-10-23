
class Komputer {
     String cekInfo(int memory) { 
    return "Komputer dengan "+memory+" GB RAM"; 
  }
}
 
class Laptop extends Komputer {
   
  String cekInfo(String pemilik) { 
    return "Ini Laptop milik " + pemilik; 
  }
}
 
class BelajarJava {
  public static void main(String args[]){
     
    Laptop laptopJembar = new Laptop();
    System.out.println(laptopJembar.cekInfo(16));
    System.out.println(laptopJembar.cekInfo("Jembar"));
 
  }
}
