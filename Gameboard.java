import wheels.users.Frame;

public class Gameboard extends Frame 
{
	public static final int NUMBRICKS = 10;
	private Brick [] _brick;
	
	public Gameboard() {
		_brick = new Brick[NUMBRICKS];
		for (int i = 0; i < NUMBRICKS; i++) 
		{
			_brick[i] = new Brick(i * (Brick.WIDTH + 5), 0);
		}
	}
	
	public static void main(String[] args) {
		new GameBoard();
	}
}
/*import wheels.users.Frame;
import java.util.Random;

public class GameBoard extends Frame {
	public static final int NUMBRICKS = 10;
	private Brick [] _brick;
	private Bat _bat;
	
	public GameBoard() {
		_brick = new Brick[NUMBRICKS];
		Random rand = new Random();
		for (int i = 0; i < NUMBRICKS; i++) {
			int r = rand.nextInt(3);
			if (r == 0)
				_brick[i] = new GoldBrick(i * (Brick.WIDTH + 5), 0);
			else if (r == 1)
				_brick[i] = new HideBrick(i * (Brick.WIDTH + 5), 0);
			else
				_brick[i] = new DropBrick(i * (Brick.WIDTH + 5), 0);
		}
		_bat = new Bat(300, 450);
	}
	
	public static void main(String[] args) {
		new GameBoard();
	}
}*/

/*import wheels.users.Frame;

public class GameBoard extends Frame {
	private final int INTERVAL = 100;
	private Ball _ball;
	private MoveTimer _timer;
	
	public GameBoard() {
		_ball = new Ball(100, 50);
		_timer = new MoveTimer(INTERVAL, _ball);
		_timer.start();
	}
	
	public static void main(String[] args) {
		new GameBoard();
	}
}*/

/*import wheels.users.Frame;
import java.util.Random;

public class GameBoard extends Frame {
	public static final int NUMBRICKS = 10;
	private Brick [] _brick;
	private Bat _bat;
	
	public GameBoard() {
		_brick = new Brick[NUMBRICKS];
		Random rand = new Random();
		for (int i = 0; i < NUMBRICKS; i++) {
			int r = rand.nextInt(3);
			if (r == 0)
				_brick[i] = new GoldBrick(i * (Brick.WIDTH + 5), 0);
			else if (r == 1)
				_brick[i] = new HideBrick(i * (Brick.WIDTH + 5), 0);
			else
				_brick[i] = new DropBrick(i * (Brick.WIDTH + 5), 0);
		}
		_bat = new Bat(300, 450);
	}
	
	public static void main(String[] args) {
		new GameBoard();
	}
}*/

