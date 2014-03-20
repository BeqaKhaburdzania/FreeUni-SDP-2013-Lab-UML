// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public class TextBoxMemento   implements IMemento
{
    private static int s_UniqueIdCounter = 1;
    private int m_CaretPostition;
    private final Selection m_Selection;
    private String m_Text;
    private int m_UniqueId;
    public TextBoxMemento(String text, int caretPostition, Selection selection) throws Exception {
        m_Text = text;
        m_CaretPostition = caretPostition;
        m_Selection = selection;
        s_UniqueIdCounter++;
        m_UniqueId = s_UniqueIdCounter;
    }

    public String getText() throws Exception {
        return m_Text;
    }

    public int getCaretPostition() throws Exception {
        return m_CaretPostition;
    }

    public Selection getSelection() throws Exception {
        return m_Selection;
    }

    public String getDescription() throws Exception {
        return String.format("Step: '%s'; Caret: %s; Selection:%s-%s", m_UniqueId, getCaretPostition(), getSelection().getStart(), getSelection().getLength());
    }
}