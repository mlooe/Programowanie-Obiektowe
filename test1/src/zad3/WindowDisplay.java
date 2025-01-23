package zad3;

public class WindowDisplay {
    public Message message;

    public WindowDisplay(Message message) {
        this.message = message;
    }

    public void showMessage(){
        message.showMessage();
    }
}
