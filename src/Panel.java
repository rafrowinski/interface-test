import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	List<IFigura> figury;

	/**
	 * Create the panel.
	 */
	public Panel(List<IFigura> figury) {
		this.figury = figury;
	}

	@Override
	public void paintComponent(Graphics g) {
		for (IFigura figura : figury) {
			figura.rysujSie(g);
		}
	}

}
