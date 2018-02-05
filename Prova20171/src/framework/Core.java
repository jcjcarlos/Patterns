package framework;

import framework.interfaces.ICore;
import framework.interfaces.IProjectController;
import framework.interfaces.IUIController;

public class Core implements ICore {
	
	private static Core core;
	private IUIController uIController;
	private IProjectController projectController;
	
	private Core (){
	}
	
	public static Core getInstance() {
		if (core == null)
			core = new Core();
		return core;
	}

	@Override
	public void initialize() {
            uIController = UIController.getInstance();
            projectController = ProjectController.getInstance();
            
            uIController.initialize();
            projectController.initialize();
	}
	
}
