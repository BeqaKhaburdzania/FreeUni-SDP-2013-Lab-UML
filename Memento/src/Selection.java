// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public class Selection   
{
    public Selection(int start, int length) throws Exception {
        setLength(length);
        setStart(start);
    }

    private int __Start = 0;
    public int getStart() {
        return __Start;
    }

    public void setStart(int value) {
        __Start = value;
    }

    private int __Length = 0;
    public int getLength() {
        return __Length;
    }

    public void setLength(int value) {
        __Length = value;
    }

    public boolean getIsEmpty() throws Exception {
        return getStart() == getLength();
    }

    public boolean includes(int index) throws Exception {
        return index >= getStart() && index < getStart() + getLength();
    }

    public static Selection getEmpty() throws Exception {
        return new Selection(0,0);
    }
}


