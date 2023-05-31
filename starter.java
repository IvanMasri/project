import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class starter {
    public static void main(String args[]) {
		CPS cps = new CPS();
        CPS button = new CPS();
	}
}


class CPS{
    JFrame frame = new JFrame();
    JLabel click = new JLabel();
    JButton button;
    JLabel timeLabel = new JLabel();
    int seconds = 0;
    int minutes = 0;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);
    
    
    
    CPS () {
        timeLabel.setText(minutes_string + ":" + seconds_string);
        timeLabel.setBounds(100,100,200,100);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        Timer timer = new Timer(1000, new ActionListner(){
            public void actionPerformed(ActionEvent e){
                elapsedTime=elapsedTime  + 1000;
                seconds = (elapsedTime/1000) % 60;
                seconds_string = String.format("%02d", seconds);
                timeLabel.setText(minutes_string+":"+seconds_string);
            }
        });

        button = new JButton();
        button.setBounds(100,200,200,100);
        click.setFont(new Font("Verdana",Font.PLAIN,35));
        
        
        frame.add(timeLabel);
        frame.add(click);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}