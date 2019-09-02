package sepedaDemo;
public class sepeda1841720144Rizqi {
    private String mMerek;
    private String mWarna;
    private int mKecepatan;
    private int mGear;
    
public void  setMerekRizqi(String newValue){
    mMerek = newValue;
}    
public void remRizqi (int decrement){
    mKecepatan = mKecepatan - decrement;
}

public void setWarnaRizqi (String wrn){
    mWarna = wrn;
}
public void tambahKecepatanRizqi (int increment){
    mKecepatan = mKecepatan + increment;
}
public void gantiGearRizqi (int newValue){
    mGear = newValue;
}
public void cetakstatusRizqi(){
    System.out.println("Merek : "+ mMerek);
    System.out.println("Kecepatan : "+ mKecepatan);
    System.out.println("Gear : "+ mGear);
    System.out.println("Warna : "+ mWarna);
}

}
