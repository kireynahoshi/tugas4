/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugscwy;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class Tugs4 {
    public static void main(String[] args) {
        GUI g = new GUI();
    }
}
class GUI extends JFrame {
final JTextField falamat = new JTextField(10);

JLabel lID = new JLabel ("bio");
JLabel labelFoto;
JLabel lnama = new JLabel ("kireyna hoshi");
JLabel lTTL = new JLabel ("jakarta, 20 juni 2000");
JLabel lagama = new JLabel(" Agama ");
   String[] namaAgama =
            {"islam","kristen","katolik","hindu","buddha"};
JComboBox cmbAgama = new JComboBox(namaAgama);
JRadioButton rbLaki = new JRadioButton("laki-Laki ");
JRadioButton rbPrmp = new JRadioButton("perempuan ");
JLabel lalamat = new JLabel ("alamat");
JButton btnSave = new JButton("save");
JButton btnEdit = new JButton("edit");

public GUI(){
    setTitle ("bio");
    setDefaultCloseOperation(3);
    setSize(350,900);
    
    ButtonGroup group = new ButtonGroup();
    group.add(rbLaki);
    group.add(rbPrmp);
   labelFoto = new JLabel (new ImageIcon (getClass().getResource(("th.jpg"))));
    
    setLayout (null);
    add(lID);
    add(labelFoto);
    add(lnama);
    add(lTTL);
    add(cmbAgama);
    add(rbLaki);
    add(rbPrmp);
    add(lalamat);
    add(falamat);
    add(btnSave);
    add(btnEdit);
    
    lID.setBounds(130,10,120,20);
    labelFoto.setBounds(100,40,120,120);
    lnama.setBounds(100,200,120,20);
    lTTL.setBounds(85,220,200,20);
    lagama.setBounds(100,230,90,20);
    cmbAgama.setBounds(40,250,230,20);
    rbLaki.setBounds(40,270,120,20);
    rbPrmp.setBounds(180,270,120,20);
    lalamat.setBounds(130,300,120,20);
    falamat.setBounds(40,320,230,100);
    btnSave.setBounds(40,440,90,30);
    btnEdit.setBounds(180,440,90,30);
    setVisible(true);
}
}