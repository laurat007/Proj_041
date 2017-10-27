/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Team {
    double primarySkill = 0;
    double secondarySkill = 0;
    double genderMix;
    double teamSatisfaction;
    double teamVelocity = 0;
    Member[] chosenMembers;
    int teamSize = 0;
    
    void addMember( Member x) {
        chosenMembers[++teamSize] = x;
        teamVelocity += chosenMembers[teamSize].velocity;
    }
    
    void getPrimarySkill() {
        for( int i = 0; i < teamSize; i++) {
            primarySkill += chosenMembers[i].primarySkill;
        }
        primarySkill = (2 * primarySkill / 3 * teamSize) * 100;
    }
    
    void getSecondarySkill() {
        for( int i = 0; i < teamSize; i++) {
            secondarySkill += chosenMembers[i].secondarySkill;
        }
        secondarySkill = (1 * secondarySkill / 3 * teamSize) * 100;
    }
    
    
    
    
}
