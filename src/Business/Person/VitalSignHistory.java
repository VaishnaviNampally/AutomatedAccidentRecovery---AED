/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SONY
 */
public class VitalSignHistory {
   private List<VitalSign> VSHistory;
   
   public VitalSignHistory(){
   //
       this.VSHistory = new ArrayList<>();
   }

    public VitalSign addVitalSign(){
    VitalSign vitalSign = new VitalSign();
    this.VSHistory.add(vitalSign);
    return vitalSign;
    }
    
    
   public void deleteVitalSign(VitalSign vitalSign){
       VSHistory.remove(vitalSign);
   }
   
    public List<VitalSign> getVSHistory() {
        return VSHistory;
    }

    public void setVSHistory(List<VitalSign> VSHistory) {
        this.VSHistory = VSHistory;
    }
   
   
}
