package Abstraction3;

public class DropDown extends WebApplication {
    @Override
    public void click() {
        System.out.println("Clicking on drop down ");
        listValues();
    }

    @Override
    public void sendText() {
        System.out.println("Can not send text to dropdown");
    }

    @Override
    public void dragAndDrop() {
        System.out.println("Drag and drop dropdown");
    }
    public void listValues(){
        System.out.println("1. male \n2. Female");
    }
}
