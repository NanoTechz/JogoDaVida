package jogo.test;

import static org.junit.Assert.*;
import jogo.Life;

import org.junit.Before;
import org.junit.Test;

public class LifeTest {

	private Life life;

	@Before
	public void setUpBefore() throws Exception {
		life = new Life(3);
	}

	@Test
	public void testSemVizinhos() {
		int matriz[][] = new int[3][3];

		System.out.println(matriz[1][1]);

		matriz[1][1] = 1; // célula do meio da Matriz

		life.inicializar(matriz);
		life.simulaVida(1);

		assertEquals(0, life.getMatriz()[1][1]);
	}

	@Test
	public void testUmVizinho() {
		int matriz[][] = new int[3][3];

		System.out.println(matriz[1][1]);

		matriz[1][1] = 1; // célula do meio da Matriz
		matriz[0][0] = 1;

		life.inicializar(matriz);
		life.simulaVida(1);

		assertEquals(0, life.getMatriz()[1][1]);
	}
	
	@Test
	public void testDoisVizinhos() {
		int matriz[][] = new int[3][3];

		System.out.println(matriz[1][1]);

		matriz[1][1] = 1; // célula do meio da Matriz
		matriz[0][0] = 1;
		matriz[2][2] = 1;

		life.inicializar(matriz);
		life.simulaVida(1);

		assertEquals(1, life.getMatriz()[1][1]);
	}
	
	@Test
	public void testTresVizinhos() {
		int matriz[][] = new int[3][3];

		System.out.println(matriz[1][1]);

		matriz[0][1] = 1; // * * .
		matriz[0][0] = 1; // * . .
		matriz[1][0] = 1; // . . .

		life.inicializar(matriz);
		life.simulaVida(1);

		assertEquals(1, life.getMatriz()[1][1]);
	}
}
