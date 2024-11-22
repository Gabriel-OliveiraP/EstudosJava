package estudo.interfaces.interfaceComHerança;

public abstract class AbstractShape implements Shape{
		Color color;

		public AbstractShape() {
			
		}
		public AbstractShape(Color color2) {
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}
		
}
