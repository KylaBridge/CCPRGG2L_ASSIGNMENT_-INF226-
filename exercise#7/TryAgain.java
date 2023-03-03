import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgain extends JFrame{
    TryAgain(){
        

        JLabel label = new JLabel();
        label.setText("GAME OVER");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        //button event


        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));


        //exit event
        exitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            System.exit(0);
    }
    });

    
        this.add(tryAgainButton);
        this.add(exitButton);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.MAGENTA);
        // lock frame
        this.setResizable(false);   


    EventHandler event = new EventHandler();
    tryAgainButton.addActionListener(event);

    }


    private class EventHandler implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent e) {
            // open game frame 
            new GameFrame();
              // Close main menu frame           
               dispose();
             }
            }
    
        }



