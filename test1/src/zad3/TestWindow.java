package zad3;


public class TestWindow {
    public static void main(String[] args) {
        WindowDisplay windowDisplay = new WindowDisplay(new ErrorMessage());
        WindowDisplay windowDisplay2 = new WindowDisplay(new InfoMessage());

        windowDisplay.showMessage();
        windowDisplay2.showMessage();
    }
}
