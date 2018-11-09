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
 * @author Dell
 */
public class AccidentHistory {
    private List<Accident> AccidentHistory;
   
   public AccidentHistory(){
   //
       this.AccidentHistory = new ArrayList<>();
   }

    public Accident addAccidentRecord(){
    Accident accident = new Accident();
    this.AccidentHistory.add(accident);
    return accident;
    }
    
    
   public void deleteAccidentRecord(Accident accident){
       AccidentHistory.remove(accident);
   }

    public List<Accident> getAccidentHistory() {
        return AccidentHistory;
    }

    public void setAccidentHistory(List<Accident> AccidentHistory) {
        this.AccidentHistory = AccidentHistory;
    }
 
   
}
