/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Events {
    
    void genderPenalty(Team t) {
        int count = 0;
        for(int i = 0; i < t.teamSize; i++) {
            if(t.chosenMembers[i].gender == 1)
                count ++;
        }
        double perc = count / t.teamSize * 100;
        if(perc < 40 || perc > 60) {
            t.teamVelocity *= 0.8;
            //print "unbalanced team"
        }
    }
    
    void sizePenalty(Team t) {
        if(t.teamSize >= 8)
            t.teamVelocity *= 0.8;
        else if(t.teamSize == 7)
            t.teamVelocity *= 0.85;
            else if(t.teamSize == 6)
                    t.teamVelocity *= 0.9;
                else if(t.teamSize == 5)
                    t.teamVelocity *= 0.95;
    }
    
}
