// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public class TextBox   
{
    private int m_CaretPostition = 0;
    private Selection m_Selection;
    private String m_Text = new String();
    public TextBox() throws Exception {
        setText("");
    }

    public String getText() throws Exception {
        return m_Text;
    }

    public void setText(String value) throws Exception {
        m_Text = value;
        m_CaretPostition = 0;
        getSelection();
		m_Selection = Selection.getEmpty();
    }

    public int getCaretPostition() throws Exception {
        return m_CaretPostition;
    }

    public Selection getSelection() throws Exception {
        return m_Selection;
    }

    public IMemento createMemento() throws Exception {
        return new TextBoxMemento(getText(),getCaretPostition(),getSelection());
    }

    public void moveCaretBy(int offset) throws Exception {
        m_CaretPostition = getTrimmedValue(getCaretPostition() + offset, 0, getText().length());
    }

    public void moveCaretTo(int position) throws Exception {
        m_CaretPostition = getTrimmedValue(position, 0, getText().length());
    }

    private int getTrimmedValue(int suggestedValue, int minValue, int maxValue) throws Exception {
        if (suggestedValue < minValue)
            return minValue;
         
        if (suggestedValue > maxValue)
            return maxValue;
         
        return suggestedValue;
    }

    public void select(Selection selection) throws Exception {
        int start = getTrimmedValue(selection.getStart(), 0, getText().length());
        int length = getTrimmedValue(selection.getLength(), 0, getText().length() - start);
        m_Selection = new Selection(start,length);
    }

    public void applyMemento(IMemento memento) throws Exception {
        if (memento == null)
            throw new IllegalArgumentException("memento");
         
        TextBoxMemento textBoxMemento;
        try
        {
            textBoxMemento = (TextBoxMemento)memento;
        }
        catch (ClassCastException ex)
        {
            throw new IncompatibleMementoException(String.format("Only memento of type [%s] be applied to [%s] ", memento.getClass().getName(), this.getClass().getName()), ex);
        }

        setText(textBoxMemento.getText());
        moveCaretTo(textBoxMemento.getCaretPostition());
        select(textBoxMemento.getSelection());
    }
}


