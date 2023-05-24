import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class starter {
    public static void main(String args[]) {
		CPS cps = new CPS();
        CPS diff = new CPS();
	}
}


class CPS{
    JFrame frame = new JFrame();
    JLabel timeLabel = new JLabel();
    int seconds = 0;
    int minutes = 0;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);
    
    
    
    CPS () {
        timeLabel.setText(minutes_string + ":" + seconds_string);
        timeLabel.setBounds(90,90,500,500);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);
        
        frame.add(timeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}