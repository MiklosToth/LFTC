/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Atom;

/**
 *
 * @author Anne
 */
public class Operator extends Atom{
     public static String operator[] = {"+", "-", "*", "/", "(", ")", "[","]", "<", ">", "<=", ">=", "<>", "=", ":="};

    public Operator(String atom) {
        super(atom);    
    }

    public static boolean isOperator(String s) {
        return Atom.isInArray(operator, s);
    }
}
