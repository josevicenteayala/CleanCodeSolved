package com.intergrupo.cleancode.functions;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class switchFunctionSolveTest {
	private SwitchFunctionSolve switchFunctionSolve = new SwitchFunctionSolve();

	@Test
	void testEngineeringProjectCost() {
		Project engineeringProject = new EngineeringProjectImpl();
		try {
			System.out.println(switchFunctionSolve.projectCost(engineeringProject));
			assertTrue("The project cost must be 20.0 ", switchFunctionSolve.projectCost(engineeringProject) == 20.0);
		} catch (ProjectCostException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testSocialProjectCost() {
		Project socialProject = new SocialProjectImpl();
		try {
			System.out.println(switchFunctionSolve.projectCost(socialProject));
			assertTrue("The project cost must be 50.0 ", switchFunctionSolve.projectCost(socialProject) == 50.0);
		} catch (ProjectCostException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testMarryProjectCost() {
		Project marryProject = new MarryProjectImpl();
		try {
			System.out.println(switchFunctionSolve.projectCost(marryProject));
			assertTrue("The project cost must be 100.0 ", switchFunctionSolve.projectCost(marryProject) == 100.0);
		} catch (ProjectCostException e) {
			e.printStackTrace();
		}
	}

}
