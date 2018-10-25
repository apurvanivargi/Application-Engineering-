/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

//import java.awt.List;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author Owner
 */
public class VitalSignHistory {

    private ArrayList<VitalSigns> vitalSignHistory;
    private ArrayList<VitalSigns> AbnormalList;
    private ArrayList<VitalSigns> vitalSignList;

    public VitalSignHistory() {
        vitalSignHistory = new ArrayList<VitalSigns>();
        AbnormalList = new ArrayList<VitalSigns>();
        vitalSignList = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public VitalSigns addVitals() {
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return (vs);
    }

    public void deleteVitals(VitalSigns v) {
        vitalSignHistory.remove(v);
    }


    public void setAbnormalList(ArrayList<VitalSigns> AbnormalList) {
        this.AbnormalList = AbnormalList;
    }

    public List<VitalSigns> getAbnormalList(double maxbp, double minbp) {
        List<VitalSigns> abnList = new ArrayList<>();
        

        for (VitalSigns vs : vitalSignHistory) {
            if (vs.getBloodPressure() > maxbp || vs.getBloodPressure() < minbp) {
                abnList.add(vs);
            }

        }
        return abnList;
    }

}
