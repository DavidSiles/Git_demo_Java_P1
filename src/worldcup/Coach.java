package worldcup;

public class Coach extends Person {

    private boolean active;

    public void train(){
        System.out.println("train");
    }

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
