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
    int teamVelocity = 0;
    Member[] chosenMembers;
    int teamSize;
    
    Team(int n) {
        teamSize = n;
    }
    
    void addMember( Member x, int index) {
        chosenMembers[index + 1] = x;
        teamVelocity += chosenMembers[index + 1].velocity;
    }
    
    int getPrimarySkill() {
        for( int index = 0; index < teamSize; index++) {
            primarySkill += chosenMembers[index].primarySkill;
        }
        primarySkill
    }
    
    
    
    
}
