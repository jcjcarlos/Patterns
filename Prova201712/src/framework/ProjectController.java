/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import application.FrameWork;
import application.factories.ImageCreator;
import application.factories.TextCreator;
import application.interfaces.IFrameWork;
import framework.interfaces.IProjectController;

/**
 *
 * @author carlos
 */
public class ProjectController implements IProjectController {
	
	private static IProjectController project = null;
	private IFrameWork frameWork;

	private ProjectController() {
	}

	public static IProjectController getInstance() {
		if (project == null)
			project = new ProjectController();
		return project;
	}

	@Override
	public void initialize() {
		System.out.println("Criando FrameWork");
		IFrameWork frameWork = new FrameWork();
		System.out.println("Adicionando MethodFactory ao FrameWork");
		frameWork.setCreator(new ImageCreator());
		frameWork.fileOpen();
	}
	
}
