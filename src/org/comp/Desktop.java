package org.comp;

public class Desktop implements SoftWare,HardWare {
	
	public void desktopModel() {
		System.out.println("Desktop model");
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resources");
		
	}

	@Override
	public void softwareResources() {
		System.out.println("Software Resources");
		
	}
	public static void main(String[] args) {
		Desktop a = new Desktop();
		a.desktopModel();
		a.hardwareResources();
		a.softwareResources();
		
	}
	

}
