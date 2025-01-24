public class Program {

	public static void main(String[] args) {
		View v = new View("light");
		System.out.println(v.button);

		WidgetFactory lightWidget = new LightWidgetFactory();
		ViewWithDesignPattern viewWithDP = new ViewWithDesignPattern(lightWidget);
		System.out.println(viewWithDP.button);
	}
}
