import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frames {
    public static void main(String[] args) {

        //JFrame = a GUI zindoz to add components to

        JFrame frame = new JFrame(); //Create a frame
        frame.setTitle("Ouedrhiri Frames - Unicaen");//Set title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit oout of application
        frame.setResizable(false);//Prevent frame from being resized
        frame.setSize(420,420);//set the x-dimension , and y-dimension of the frame
        frame.setVisible(true); //Make frame visible

        ImageIcon image = new ImageIcon("logo.png");//Create an ImageIcon
        frame.setIconImage(image.getImage());//Change Icon of Image
        frame.getContentPane().setBackground(new Color(123,50,250));//Change color of background

    }
}