/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogui;

/**
 *
 * @author ASUS
 */
import java.awt.event.*;
import javax.swing.*;
public class MyInputForm1841720144Rizqi extends  JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JLabel mDLabel;
    private JTextField mAfield;
    private JTextField mBfield;
    private JButton mButton;
    private JPanel mPanel;

    public MyInputForm1841720144Rizqi() {
    createTextFieldRizqi();
    createButtonRizqi();
    createPanelRizqi();
    setSize(FRAME_WIDTH, FRAME_HEIGHT);    
    }
    private void createTextFieldRizqi(){
        mALabel = new JLabel("Nilai A: ");
        mBLabel = new JLabel("Nilai C: ");
        mCLabel = new JLabel("Hasil Kali: ");
        mDLabel = new JLabel("Hasil Tambah: ");
        
        final int FIELD_WIDTH = 10;
        mAfield = new JTextField(FIELD_WIDTH);
        mAfield.setText("");
        mBfield = new JTextField(FIELD_WIDTH);
        mBfield.setText("");

    }
    
    private void createButtonRizqi(){
        mButton = new JButton("Calculate");
        class AddInterestListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(mAfield.getText());
                int b = Integer.valueOf(mBfield.getText());
                int c = a*b;
                int d = a+b;
                mCLabel.setText("Hasil: "+ c);
                mDLabel.setText("Hasil: "+ d);
                
        }
    }
        ActionListener listener = new AddInterestListener();
        mButton.addActionListener(listener);
    }
    
    private void createPanelRizqi(){
        mPanel=new JPanel();
        mPanel.add(mALabel);
        mPanel.add(mAfield);
        mPanel.add(mBLabel);
        mPanel.add(mBfield);
        mPanel.add(mButton);
        mPanel.add(mCLabel);
        mPanel.add(mDLabel);
        add(mPanel);
        
    }
    
    public static void main(String[] args) {
        JFrame frame = new MyInputForm1841720144Rizqi();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
}
