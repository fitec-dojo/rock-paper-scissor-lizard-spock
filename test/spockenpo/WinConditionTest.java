package spockenpo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WinConditionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void tesouraCortaPapel() {
		Options winner = new WinCondition().winner(Options.TESOURA, Options.PAPEL);
		assertEquals(Options.TESOURA, winner);
	}

	@Test
	public void papelNaoVenceTesoura() {
		Options winner = new WinCondition().winner(Options.PAPEL, Options.TESOURA);
		assertEquals(Options.TESOURA, winner);
	}
	
	@Test
	public void papelCobrePedra() {
		Options winner = new WinCondition().winner(Options.PAPEL, Options.PEDRA);
		assertEquals(Options.PAPEL, winner);
	}

	@Test
	public void pedraEsmagaLagarto() {
		Options winner = new WinCondition().winner(Options.PEDRA, Options.LAGARTO);
		assertEquals(Options.PEDRA, winner);
	}

	@Test
	public void lagartoEnvenenaSpock() {
		Options winner = new WinCondition().winner(Options.LAGARTO, Options.SPOCK);
		assertEquals(Options.LAGARTO, winner);
	}
}
