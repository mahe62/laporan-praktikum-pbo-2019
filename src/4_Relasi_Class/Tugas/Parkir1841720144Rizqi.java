/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkirMobil;

/**
 *
 * @author ASUS
 */
public class Parkir1841720144Rizqi {

    private String mZona;
    private SlotParkir1841720144Rizqi[] mArrSlot;

    public Parkir1841720144Rizqi(String mZona, int jumlah) {
        this.mZona = mZona;
        this.mArrSlot = new SlotParkir1841720144Rizqi[jumlah];
        this.initSlotRizqi();
    }

    private void initSlotRizqi() {
        for (int i = 0; i < mArrSlot.length; i++) {
            this.mArrSlot[i] = new SlotParkir1841720144Rizqi(String.valueOf(i + 1));
        }
    }

    public String getmZona() {
        return mZona;
    }

    public void setmZona(String mZona) {
        this.mZona = mZona;
    }

    public SlotParkir1841720144Rizqi[] getmArrSlot() {
        return mArrSlot;
    }

    public void setmArrSlot(SlotParkir1841720144Rizqi[] mArrSlot) {
        this.mArrSlot = mArrSlot;
    }
     public void setPengunjungRizqi(Pengunjung1841720144Rizqi visit, int nomor) {
        if (this.mArrSlot[nomor - 1].getVis()== null) {
            this.mArrSlot[nomor - 1].setVis(visit);
        } else {
            System.out.println("Kursi Nomor: "+nomor+" Sudah Ditempati");
            
        }

    }
     public String infoRizqi() {
        String info = "";
        info += "Zona: " + mZona + "\n";
        for (SlotParkir1841720144Rizqi slot : mArrSlot) {
            info += slot.infoRizqi();
        }
        return info;
    }

}
