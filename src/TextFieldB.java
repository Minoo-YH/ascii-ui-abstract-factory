public class TextFieldB extends TextField {

    public TextFieldA(String text) {
        super(text);
    }

    @Override
    public void display() {
      
        System.out.println("| " + text + " |");
       
    }
  
}