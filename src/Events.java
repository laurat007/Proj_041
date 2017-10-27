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
    
    void sprintPlanningEvents(Team t, double customerSatisfaction,int question, int response) {
        switch(question) {
            case 1:
                switch(response) {
                    case 1:
                        break;
                    case 2:
                        customerSatisfaction *= 0.97;
                        break;
                    case 3:
                        t.teamSatisfaction *= 0.97;
                        customerSatisfaction *= 0.97;
                        break;
                }
                break;
        }
    }
    
    void dailyScrumUnexpectedEvents(Team t, double customerSatisfaction,int question, int response) {
        switch(question) {
            case 1:
                switch(response) {
                    case 1:
                        t.teamSatisfaction *= 1.02;
                        break;
                    case 2:
                        t.teamSatisfaction *= 0.98;
                        t.teamVelocity *= 0.95;
                        break;
                    case 3:
                        t.teamVelocity *= 0.95;
                        break;
                }
                break;
        }
    }
    
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
