class VerticalLayout extends WindowComponent {
    private int width;
    private int height;

    public VerticalLayout(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing VerticalLayout: " + name + " [" + width + "x" + height + "]");
        for (WindowComponent component : nestedComponents) {
            component.draw();
        }
    }
}
