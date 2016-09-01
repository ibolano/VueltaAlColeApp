package com.ipartek.formacion.pojo;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.pojo.Usuario;

public class UsuarioTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		Usuario user = new Usuario();
		assertEquals(-1, user.getId());
		assertEquals("", user.getNombre());
		assertEquals("", user.getPassword());
		assertEquals("", user.getEmail());
	}

}
