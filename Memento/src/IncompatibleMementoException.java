// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public class IncompatibleMementoException  extends IllegalStateException 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncompatibleMementoException(String message, ClassCastException innerException) throws Exception {
        super(message, innerException);
    }

}


