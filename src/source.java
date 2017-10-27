
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class source {
    public static void main(String arg[]) {
        Team t = new Team();
        Member[] allOptions = null;
        Hashtable ability = new Hashtable();
        ability.put("FRONTEND", 1);
        ability.put("BACKEND", 2);
        ability.put("INTEGRATIONS", 3);
        ability.put("AI", 4);
        
        String[] girlsName = {"ANA", "MARIA", "CORNELUSA", "BRANDUSA"};
        String[] boysName = {"MIKE", "TAYSON", "JOHN", "ROBY"};
        
        for(int i = 0; i < 5; i++) {
            Random r = new Random();
            int p = r.nextInt(4);
            int s = r.nextInt(4);
            while(s != p)
                s = r.nextInt(4);
            allOptions[i] = new Member(girlsName[i], 1, p - 1, s -1);
        }
        
        
    }
}
