
public class ChatView extends AbstractView {
	
	public ChatView(){
		
	}

	@Override
	public String init() {
		return name+": I am booorn!";
		
	}

	@Override
	public String resize() {
		return name+": I was resized!";
		
	}

	@Override
	public String update() {
		return name+ ": Who is here?!";
		
	}

}
