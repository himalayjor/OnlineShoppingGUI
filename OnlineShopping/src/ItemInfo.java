
import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikash
 */
public class ItemInfo {
    
    String Item_Id;
    String Item_Name;
    int Item_Price;
    int Item_qty;
    String Item_cat;
    String Item_det;
    ImageIcon b;
    
 

	public ItemInfo(String Item_Id, String Item_Name, int Item_Price, int Item_qty, String Item_cat, String Item_det, ImageIcon b) {
		this.Item_Id = Item_Id;
		this.Item_Name = Item_Name;
		this.Item_Price = Item_Price;
		this.Item_qty = Item_qty;
		this.Item_cat = Item_cat;
		this.Item_det = Item_det;
		this.b = b;
	}
    
    

    
    
}
