import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<IFigura> figury = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			IFigura prostokat = new Prostokat(200 + 10 * i, 10 * i, 60 * i, 80 * i);
			IFigura kolo = new Kolo(10 * i, 10 * i, 30 * i);
			figury.add(prostokat);
			figury.add(kolo);
		}

		Ramka frame = new Ramka(figury);
		frame.setVisible(true);

	}
}
