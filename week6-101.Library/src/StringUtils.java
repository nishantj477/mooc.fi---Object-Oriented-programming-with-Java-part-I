

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
public class StringUtils {
    public static boolean included(String word, String searched){
        String nsearched = searched.trim().toUpperCase();
        String nword = word.toUpperCase();
         if (nword.contains(nsearched))
             return true;
         else
             return false;
        
    }
}
