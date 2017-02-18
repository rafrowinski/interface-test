import java.awt.Graphics;

public class Kolo extends Figura {
	int promien;

	public Kolo(int x, int y) {
		super(x, y);
	}

	public Kolo(int x, int y, int promien) {
		super(x, y);
		this.promien = promien;
	}

	@Override
	public void rysujSie(Graphics g) {
		g.drawOval(x, y, promien, promien);
	}

}
