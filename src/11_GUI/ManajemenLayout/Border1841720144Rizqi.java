/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManajemenLayout;

/**
 *
 * @author ASUS
 */
import java.awt.BorderLayout;
import javax.swing.*;
public class Border1841720144Rizqi extends JFrame{
        private static final int FRAME_WIDTH = 600;
        private static final int FRAME_HEIGHT = 200;
        private JPanel mPanel;

    public Border1841720144Rizqi() {
        mPanel=new JPanel();
        mPanel.setLayout(new BorderLayout());
        
        mPanel.add(new JButton("1"), BorderLayout.NORTH);
        mPanel.add(new JButton("2"), BorderLayout.WEST);
        mPanel.add(new JButton("3"), BorderLayout.CENTER);
        mPanel.add(new JButton("4"), BorderLayout.EAST);
        mPanel.add(new JButton("5"), BorderLayout.SOUTH);
        
        add(mPanel);
        setSize (FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("Border Layout Demo");
    }
        
        

    
}
