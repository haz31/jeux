package youtube;

public class main {

	public static void main(String[] args) {
		Player player1 = new Player("sebounator",300,50);
		System.out.println("name player 1 :"+" "+ player1.getName());
		System.out.println("health player 1:" + player1.getHealth());
		System.out.println("attack player 1 :" + player1.getAttack());
		
		
		Player player2 = new Player("SuperMohamed",1000,100);
		System.out.println("name player2 :"+player2.getName());
		System.out.println("health player 2 :"+player2.getHealth());
		System.out.println("damage player 2 :"+player2.getAttack() );
		
		player2.damage(player1.getAttack());
		System.out.println("player 1 attaque player 2");
		System.out.println("vie restante de : "+player1.getName()+" "+player1.getHealth());
		System.out.println("vie restante de : "+player2.getName()+" "+player2.getHealth());
		
	}
	
}
		
		
