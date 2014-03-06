
import java.util.Date;

  public  class  OrderClass {
    int order_no;
    Date date;
   int total_amount;
   String ship_name;
   String ship_address;
   String ship_mob;

	public OrderClass(int order_no, Date date, int total_amount, String ship_name, String ship_address, String ship_mob) {
		this.order_no = order_no;
		this.date = date;
		this.total_amount = total_amount;
		this.ship_name = ship_name;
		this.ship_address = ship_address;
		this.ship_mob = ship_mob;
	}
   
}
