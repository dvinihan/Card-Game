import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {

	public ImageTest(){
		testImage();
	}

	public void testImage(){
	BufferedImage img = null;{
	try {
	    img = ImageIO.read(getClass().getResource("/images/ace_of_spades.png"));
	} catch (IOException e) {
	}
	
//	JLabel headerImage = new JLabel(new ImageIcon(img));
	
	}
	}
}
