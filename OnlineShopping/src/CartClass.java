// HJ


import java.util.*;
import java.sql.*;


public class CartClass  {

		
	public CartClass()  {
		arr = new ArrayList();
	}
	
        public Object getAtIndex(int i) {
            return arr.get(i);
        }
	
	public void clearCart() {
		arr.clear();
	}
	
	public void add(String itemid, int quan) {
		for (int i = 0; i < arr.size(); i++) {
			itemObject x = (itemObject) arr.get(i);
			if (x.id == itemid) {
				x.quantity += quan;
				return;
			}
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",database.uname, database.password);
			pst = conn.prepareStatement("Select item_name, item_price from item where item_id = ?");
			pst.setString(1, itemid);
			rs = pst.executeQuery();
			
			
			if (rs.next()) {
				arr.add(new itemObject(itemid, quan, rs.getInt(2), rs.getString(1)));
			}
			
			pst.close();
			conn.commit();
			conn.close();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}
	
	public void remove(String itemid) {
		for (int i = 0; i < arr.size(); i++) {
			itemObject x = (itemObject) arr.get(i);
			if (x.id.equals(itemid)) {
				
				arr.remove(i);
				break;
			}
						
		}
	}
	
	public void changeQuantity(int index, int newQuantity) {
		itemObject item = (itemObject) arr.get(index);
		item.quantity = newQuantity;
		arr.set(index, item);
	}
	
	public int getFinalPrice() {
		int val = 0;
		itemObject item;
		
		for (int i = 0; i < arr.size(); i++) {
			item = (itemObject) arr.get(i);
			val += item.price * item.quantity;
		}
		return val;
	}
	
	public void removeItemByIndex(int i) {
		arr.remove(i);
	}
	
	public ArrayList getList()	{
		return arr;
	}
	
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement pst;
    private ArrayList arr;
}
