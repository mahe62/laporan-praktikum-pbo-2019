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
import java.awt.GridLayout;
import javax.swing.*;
public class Grid1841720144Rizqi extends JFrame{
    private static final int FRAME_WIDTH = 600;
        private static final int FRAME_HEIGHT = 200;
        private JPanel mPanel;

    public Grid1841720144Rizqi() {
        mPanel=new JPanel();
        mPanel.setLayout(new GridLayout(4,2));
        mPanel.add(new JButton("1"));
        mPanel.add(new JButton("2"));
        mPanel.add(new JButton("3"));
        mPanel.add(new JButton("4"));
        mPanel.add(new JButton("5"));
        mPanel.add(new JButton("6"));
        mPanel.add(new JButton("7"));
        mPanel.add(new JButton("8"));
        
        add(mPanel);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("Grid Layout Demo");
        
    }
        
        
}
