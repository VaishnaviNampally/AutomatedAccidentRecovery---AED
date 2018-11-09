/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Dell
 */
public class MedicalDocs {
    ImageIcon image;
    String description;
    String URL;
   
    public ImageIcon getImage(String url) {
        ImageIcon imgIcon = new ImageIcon(url);
        Image image = imgIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        ImageIcon img = new ImageIcon(newimg);  // transform it back
        return img;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }
    
}
