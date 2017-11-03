package com.intergrupo.cleancode.functions;

public class SwitchFunctionSolve {

	public double projectCost(Project project) throws ProjectCostException{
		return project.calculateProjectCost();
	}

}

interface Project{
	double calculateProjectCost();
}

class EngineeringProjectImpl implements Project{

	@Override
	public double calculateProjectCost() {
		return 20;
	}	
}

class SocialProjectImpl implements Project{

	@Override
	public double calculateProjectCost() {
		return 50;
	}
	
}

class MarryProjectImpl implements Project{

	@Override
	public double calculateProjectCost() {
		return 100;
	}
	
}

class ProjectCostException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6925630166696930259L;

}