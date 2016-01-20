import java.util.Random;

public class Spawner {
	private GameObjectHandler handler;
	private int timer;
	
	public Spawner(GameObjectHandler handler) {
		this.handler = handler;
	}
	
	//Initialize the Player object and set timer = 0;
	public void init() {
		//make sure that when I clicked play, the timer will be reset to be 0;
		timer = 0;
		handler.addObject(new Player(100, 100, GameObjectID.Player, handler));
	}
	

	public void spawn() {
		int spawn = ++timer;
		int normalCreep = 1;

		
		if(spawn % 200 == 0){
			Random r = new Random();
			handler.addObject(new EnemyDummy(r.nextInt(Main.WIDTH - 30), 0, GameObjectID.Enemy));
			handler.addObject(new EnemyTricky(r.nextInt(Main.WIDTH - 30), 0, GameObjectID.Enemy));
			handler.addObject(new EnemyNormal(r.nextInt(Main.WIDTH - 30), 0, GameObjectID.Enemy));
		}
		
		
	}
	

}