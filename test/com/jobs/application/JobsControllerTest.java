package com.jobs.application;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.jobs.domain.AbsStaffMember;

public class JobsControllerTest {

	@Test
	public void test() throws Exception {
		JobsController controller = new JobsController();
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createManagerEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		List<AbsStaffMember> allEmployees = controller.getAllEmployees();
		for (AbsStaffMember absStaffMember : allEmployees) {
			System.out.println(absStaffMember);
		}
		int count = allEmployees.size();
		assertEquals(2, count);
	}

}
