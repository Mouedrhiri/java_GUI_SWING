import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label {
    /**
     * @param args
     */
    public static void main(String[] args) {

        //JLabel = a GUI display area for a string of text , an image , or both

        JLabel label = new JLabel();
        //Add text to the frame :

        label.setText("Ouedrhiri first Label program ");

        //Add image to the frame :

        ImageIcon img = new ImageIcon("logo.png");
        label.setIcon(img);

        //Set text LEFT , Center , Right of imageIcon :
        label.setHorizontalTextPosition(JLabel.CENTER);

        //Set text TOP , Center , BOTTOM of imageIcon :
        label.setVerticalTextPosition(JLabel.TOP);

        //Set font color of text :
        label.setForeground(new Color(0x00FF00));

        //Set Font of text :
        label.setFont(new Font("Monospaced", Font.PLAIN, 20));

        //Define text GAP (space between text and label ICON):
        label.setIconTextGap(100);

        //Setting background color for our label :
        label.setBackground(Color.black);

        //Display Background Color :
        label.setOpaque(true);

        //Add border to a label :
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        label.setBorder(border);

        //label setting diemnsions and layout :
        label.setBounds(0,0,250,250); //setting x,y position within frame as well as dimensions

        //Set vertical/horizontal position of icon+text within label:
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        //if we want to make the label fits all the frame even if it is resizable : 
        //we add frame.pack and remove Bounds and default size and default layout


        //JFrame = a GUI window to add components to

        JFrame frame = new JFrame(); //Create a frame
        frame.setTitle("Ouedrhiri Frames - Unicaen");//Set title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit oout of application
        frame.setSize(500, 500);//set the x-dimension , and y-dimension of the frame
        frame.setLayout(null);//setting layout to null so nothing in there
        frame.setVisible(true); //Make frame visible

        frame.add(label);

        ImageIcon image = new ImageIcon("logo.png");//Create an ImageIcon
        frame.setIconImage(image.getImage());//Change Icon of Image
        frame.getContentPane().setBackground(new Color(123, 50, 250));//Change color of background

        
        

    }
}
