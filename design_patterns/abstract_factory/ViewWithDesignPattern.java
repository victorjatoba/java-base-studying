public class ViewWithDesignPattern {
	public String label;
	public String button;

	public ViewWithDesignPattern(WidgetFactory w) {
		this.label = w.createLabel();
		this.button = w.createButton();
	}
}
