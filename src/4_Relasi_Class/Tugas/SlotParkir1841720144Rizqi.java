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
public class SlotParkir1841720144Rizqi {
    private String mNomor;
    private Pengunjung1841720144Rizqi vis;

    public SlotParkir1841720144Rizqi() {
    }

    public SlotParkir1841720144Rizqi(String mNomor) {
        this.mNomor = mNomor;
    }
    

    public String getmNomor() {
        return mNomor;
    }

    public void setmNomor(String mNomor) {
        this.mNomor = mNomor;
    }

    public Pengunjung1841720144Rizqi getVis() {
        return vis;
    }

    public void setVis(Pengunjung1841720144Rizqi vis) {
        this.vis = vis;
    }
    
    public String infoRizqi() {
        String info = "";
        info += "Nomor: " + mNomor + "\n";
        if (this.vis != null) {
            info +=vis.infoRizqi()+ "\n";
        }
        return info;
    }
}
