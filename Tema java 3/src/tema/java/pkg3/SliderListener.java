/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tema.java.pkg3;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class SliderListener implements ChangeListener {
    
    MainFrame _frame;
    
    public SliderListener(MainFrame frame) {
        _frame = frame;
    }
    
    int _value = 0;
    
    public int getValue() {
        return _value;
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        
            _value = (int)source.getValue();
            
            Surface s = _frame.getDrawingSurface();
            if ("SliderC1".equals(source.getName()))
                s.setWidthC1(_value);
            
            if ("SliderC2".equals(source.getName()))
                s.setWidthC2(_value);
            
            s.repaint();
         
            // afisex valori
            DecimalFormat df = new DecimalFormat("#.##");
            JLabel l = _frame.getTangentLabel();
            l.setText("Tan unghi C1: " + df.format(s.getTan1()) + 
                    "; Tan unghi C2: " + df.format(s.getTan2()));
    }
}
