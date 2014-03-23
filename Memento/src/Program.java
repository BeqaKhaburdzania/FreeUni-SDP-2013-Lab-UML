
public class Program {

	public static void main(String[] args) throws Exception {
        TextBox textBox = new TextBox();
        Caretaker caretaker = new Caretaker(textBox);
        System.out.println("························ Initialize");
        textBox.setText("Hello world!");
        System.out.println("························ Selection 3 -> 3");
        textBox.select(new Selection(3,3));
        textBox.moveCaretBy(2);
        System.out.println(textBox.getText());
        caretaker.snapshot();
        System.out.println("························ Snapshot");
        System.out.println("························ Edit");
        textBox.setText("Good bye world!");
        System.out.println("························ Selection 4 -> 4");
        textBox.select(new Selection(4,5));
        textBox.moveCaretBy(8);
        System.out.println(textBox.getText());
        caretaker.snapshot();
        System.out.println("························ Snapshot");
        System.out.println("························ Edit");
        textBox.setText("Foo");
        System.out.println(textBox.getText());
        caretaker.undo();
        System.out.println("························ Undo");
        System.out.println(textBox.getText());
        caretaker.undo();
        System.out.println("························ Undo");
        System.out.println(textBox.getText());
	}

}
