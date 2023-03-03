import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class ColorMenu extends JFrame{
    //JList
    JList colorList;

    //color arrays
    private String[] colorNameArray = {"GRAY", "LIGHT GRAY", "WHITE", "BLACK"};
    private Color[] colorClassArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK};



    ColorMenu(){

        // Jlist
        colorList = new JList(colorNameArray);
        // Restricts to one selection
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        colorList.setFont(new Font("Algerian", Font.BOLD, 25));
        this.add(colorList);

        bgColorEventHandler bgcolorHandler = new bgColorEventHandler();
        colorList.addListSelectionListener(bgcolorHandler);


        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.PINK);
        // lock frame
        this.setResizable(false);

    }

    
    private class bgColorEventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGcolor = colorClassArray[colorList.getSelectedIndex()];

            //open gameFrame
            new GameFrame();
            dispose();
        }
    } 
    
}
