package enumTest;

public class enumPractice {
	public static void main(String[] args) {
		/*System.out.println(Signal.GREEN);*/
		/*Signal color = Signal.YELLOW;
		System.out.println(color);		
		System.out.println(change(color));*/
		/*Color c = Color.GREEN;
		System.out.println(c.getIndex());
		System.out.println(c.getName(c.getIndex()));
		System.out.println(c.toString());*/
		/*Color c = Color.GREEN;
		c.print();
		System.out.println(c.getInfo());*/
		for(Food.Dessert dessert : Food.Dessert.values()) {
			System.out.print(dessert + " ");
		}
		System.out.println();
		for(Food.Coffee coffee : Food.Coffee.values()) {
			System.out.print(coffee + " ");
		}
		

		
	}
	//常量
	public static enum Signal{
		RED,YELLOW,GREEN
	}
	//switch
	public static Signal change(Signal color) {
		switch(color) {
		case RED:
			color = Signal.GREEN;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		default:
			break;
		}
		return color;
	}
}
