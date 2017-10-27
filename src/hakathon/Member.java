package hakathon;


import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Member {
    String name;
    int gender;
    int velocity = (int)(Math.random() * 10);
    double motivationLevel = (int)(Math.random() * 100);
    int primarySkill;
    int secondarySkill;
    
    Member(String givenName, int gen, int primS, int secS) {
        if(velocity > 5)
            velocity -= 4;
        if(motivationLevel < 50)
            motivationLevel += 50;
        name = givenName;
        gender = gen;
        primarySkill = primS;
        secondarySkill = secS;
    }
    
    
    
}
