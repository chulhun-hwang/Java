package Week5;

import java.util.ArrayList;

public class GameCharacter {

	private class GameItem{
		String name;
		int type;
		int price;
		
		int getPrice(){ return price; }
		
		public String toString(){
			return "GameItem [ Name : " + name+ " Type : " + type + " Price : " + price + " ]";
		}
	}
	
	private ArrayList<GameItem> list = new ArrayList<>();
	
	public void add(String name, int type, int price){
		GameItem item = new GameItem();
		item.name = name;
		item.type = type;
		item.price = price;
		
		list.add(item);
	}
	
	public void print(){
		int total = 0;
		for (GameItem item:list){
			System.out.println(item);
			total+= item.getPrice();
		}
		System.out.println(total);
	}
}
