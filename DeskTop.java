package week3day2;



public  class DeskTop implements Hardware, SoftWare { //Multiple-Inheritance
	public void softwareResources() {
		System.out.println("Software Resources Method is succesfully called!");
	}

	public void hardwareResources() {
		System.out.println("Hardware Resources Method is succesfully called!");
	}

	public void desktopModel() {
		System.out.println("Desktop Model Method is successfully called!");
	}

	public static void main(String[] args) {
		DeskTop desktop = new DeskTop();
		desktop.hardwareResources();
		desktop.hardwareResources();
		desktop.desktopModel();
	}
}
