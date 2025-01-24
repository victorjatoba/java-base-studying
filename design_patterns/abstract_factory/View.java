public class View {
	public String label;
	public String button;

	public View(String theme) {
		if (theme == "dark") {
			this.label = "dark";
			this.button = "dark";
		} else if (theme == "light") {
			this.label = "light";
			this.button = "light";
		}

	}
}
