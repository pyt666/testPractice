package enumTest;

public interface Food {
	enum Coffee implements Food{
		BlACK_COFFEE,DECAF_COFFEE,LATTE,CAPPUCCINO
	}
	enum Dessert implements Food{
		FRUIT,CAKE,GELATO
	}
}
