/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

import javax.swing.JComboBox;

/**
 *
 * @author ok
 */
public class ComboBoxSuggestion<E> extends JComboBox<E>{
    
    public ComboBoxSuggestion(){
        setUI(new ComboSuggestionUI());
    }
    
}
