// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

import java.util.*;

public class Caretaker   
{
    private final TextBox m_TextBox;
    private final Stack<IMemento> m_UndoStack = new Stack<IMemento>();
    public Caretaker(TextBox textBox) throws Exception {
        m_TextBox = textBox;
    }

    public void snapshot() throws Exception {
        IMemento memento = m_TextBox.createMemento();
        m_UndoStack.push(memento);
    }

    public void undo() throws Exception {
        if (!canUndo())
            throw new IllegalStateException("Undo stack is empty.");
         
        IMemento memento = m_UndoStack.pop();
        m_TextBox.applyMemento(memento);
    }

    private boolean canUndo() throws Exception {
        return m_UndoStack.size() != 0;
    }

}


