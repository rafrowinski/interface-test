import java.awt.Graphics;

public class Prostokat extends Figura {
	int szerokosc, wysokosc;

	public Prostokat(int x, int y) {
		super(x, y);
	}

	public Prostokat(int x, int y, int szerokosc, int wysokosc) {
		super(x, y);
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
	}

	@Override
	public void rysujSie(Graphics g) {
		g.drawRect(x, y, szerokosc, wysokosc);
	}

}
