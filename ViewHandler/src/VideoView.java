
public class VideoView extends AbstractView{
	
	public VideoView(){
		
	}

	@Override
	public String init() {
		return name+": oh, new world!";
		
	}

	@Override
	public String resize() {
		return name+": resizing, yohoo!";
		
	}

	@Override
	public String update() {
		return name+": I smell changes...";
		
	}

}
