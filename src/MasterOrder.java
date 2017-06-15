import java.util.ArrayList;

public class MasterOrder {
	ArrayList<CookieOrder> a;
	
	MasterOrder(){
		a = new ArrayList<CookieOrder>();
	}
	
	public ArrayList<CookieOrder> getOrders(){
		return a;
	}
	
	public void addOrder(CookieOrder cookieOrder){
		a.add(cookieOrder);
	}
	
	public int getTotalBoxes(){
	int totalBoxes = 0;
		for(CookieOrder c: a){
			totalBoxes += c.getNumBoxes();		
		}
		return totalBoxes;
	}
	
	public int removeVariety(String variety){
		int ah = 0;
		for(int i = 0; i < a.size(); i++){
			CookieOrder cookieOrder = a.get(i);
			if(cookieOrder.getVariety().equals(variety)){
				a.remove(i);
				ah += cookieOrder.getNumBoxes();
			}
		}
		
		return ah;
	}
}
