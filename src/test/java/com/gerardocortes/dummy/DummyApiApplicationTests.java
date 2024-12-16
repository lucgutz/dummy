package com.gerardocortes.dummy;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gerardocortes.dummy.controller.DummyController;

@SpringBootTest
class DummyApiApplicationTests {

	@Autowired
	private DummyController dummyController;

	@Test
	void contextLoads() {
		assertNotNull(dummyController);
	}

	@Test
	void dummyController() {
		assertNotNull(null);
	}

}
