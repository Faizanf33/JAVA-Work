public class enums {
	enum Rank {
		SOLDIER,
		SERGEANT,
		CAPTAIN
	}
	public static void main(String[] args){
		Rank a = Rank.SOLDIER;

		switch(a) {
			case SOLDIER:
				System.out.println("Soldier says HI!");
				break;
			case SERGEANT:
				System.out.println("Sergeant says HELLO!");
				break;
			case CAPTAIN:
				System.out.println("Captain says WELCOME!");
				break;
		}
	}
}
