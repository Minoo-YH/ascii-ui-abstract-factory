public class Main {
  public static void main(String[] args) {

    UIFactory factory = new AFactory();
    Button button = factory.createButton("Click Me");
    Checkbox checkbox = factory.createCheckbox("Accept Terms");
    TextField textField = factory.createTextField("Enter Name");
    Checkbox rememberCheckbox = factory.createCheckbox("Remember me");

    button.display();
    checkbox.display();
    textField.display();
    rememberCheckbox.display();

    button.setText("Submit");
    button.display();

  }

}
