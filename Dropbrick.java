import java.awt.event.MouseEvent;

public class Dropbrick extends Brick 
{
	public Dropbrick(int x, int y) 
	{
		super(x, y);
	}
	
	public void mouseClicked(MouseEvent e) 
	{
		this.setLocation(this.getXLocation(), 400);
	}
}