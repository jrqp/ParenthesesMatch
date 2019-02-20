/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parenthesesmatch;

import java.util.Stack;

/**
 *
 * @author Richard
 */
public class Parenthesesmatch {

    public static void main(String[] args) {
        
         System.out.println("(a[0] + b[2c[6]]){24 + 53} passed: " + parenmatch("(a[0] + b[2c[6]]){24 + 53}"));
        System.out.println("f(e(d)) passed: " + parenmatch("f(e(d))"));
        System.out.println("((b) passed: " + !parenmatch("((b)"));
        System.out.println("(empty) passed: " + parenmatch("(empty)"));
        System.out.println("([)] passed: " + !parenmatch("([)]"));
        System.out.println(" passed: " + parenmatch("     "));
System.out.println("passed: " + parenmatch(""));
        // TODO code application logic here
    }
    
     public static boolean parenmatch(String form)
    {
        Stack<Character> pila = new Stack<Character>();        
        char[] caract = form.toCharArray();
        for(int i=0; i<form.length(); i++)
        {
            if(caract[i] == '(')
            {
                pila.push(caract[i]);
            }
            if(caract[i] == '[')
            {
                pila.push(caract[i]);
            }
            if(caract[i] == '{')
            {
                pila.push(caract[i]);
            }
            if(caract[i] == ')')
            {
                if(pila.empty()==true)
                {
                    return false;
                }
                else
                {
                    if(pila.peek()=='(')
                    {
                        pila.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            
            if(caract[i] == ']')
            {
                if(pila.empty()==true)
                {
                    return false;
                }
                else
                {
                    if(pila.peek()=='[')
                    {
                        pila.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            
            if(caract[i] == '}')
            {
                if(pila.empty()==true)
                {
                    return false;
                }
                else
                {
                    if(pila.peek()=='{')
                    {
                        pila.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            
        }
        return pila.empty();
}
    
}
