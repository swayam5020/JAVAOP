import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.awt.BorderLayout;
public class ImageViewer
{
    public ImageViewer()
    {
        SwingUtilities.invokeLater(
        new Runnable()
        {
            public void run()
            {
                JFrame frame = new JFrame("Image Viewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                BufferedImage img = null;
                try
                {
                    img = ImageIO.read(getClass().getResource("Swayam.jpg"));
                } catch (IOException e)
                {
                    e.printStackTrace();
                    System.exit(1);
                }
                ImageIcon imgIcon = new ImageIcon(img);
                JLabel lbl = new JLabel();
                JLabel lbl1 = new JLabel("It's me");
                lbl.setIcon(imgIcon);
                frame.getContentPane().add(lbl,BorderLayout.CENTER);
                frame.getContentPane().add(lbl1,BorderLayout.PAGE_START);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        }
        );
    }
    public static void main(String[] args) throws Exception
    {
        new ImageViewer();
    }
}