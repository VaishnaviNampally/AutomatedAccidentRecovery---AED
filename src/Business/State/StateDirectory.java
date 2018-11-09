/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import java.util.ArrayList;

public class StateDirectory {
    private ArrayList<State> stateDirectory;

    public StateDirectory() {
        stateDirectory = new ArrayList<>();
    }

    public ArrayList<State> getStateDirectory() {
        return stateDirectory;
    }
    
    public State createAndAddState(String name){
    State state = new State(name);
    stateDirectory.add(state);
    return state;
    }
    
    
    
    
}
