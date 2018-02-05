/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import application.fatory.FrameWork;
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
		frameWork = FrameWork.getInstance();
		frameWork.saveDocument("text1", frameWork.createDocument("D"));
		frameWork.saveDocument("image1", frameWork.createDocument("I"));
		frameWork.saveDocument("text2", frameWork.createDocument("D"));
		frameWork.saveDocument("image2", frameWork.createDocument("I"));
		frameWork.deleteDocument("text1");
		frameWork.deleteDocument("image1");
	}
	
}
