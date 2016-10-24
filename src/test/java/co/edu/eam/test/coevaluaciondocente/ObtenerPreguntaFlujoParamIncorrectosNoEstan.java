package co.edu.eam.test.coevaluaciondocente;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTest;

import co.edu.eam.exceptions.ZMessManager;
import co.edu.eam.modelo.Periodo;
import co.edu.eam.modelo.Pregunta;
import co.edu.eam.modelo.TipoEvaluacion;
import co.edu.eam.modelo.control.PreguntaLogic;
import co.edu.eam.modelo.dto.PreguntaDTO;

/**
 * Unit test for Hello.
 * <p/>
 * A unit test aims to test all code and code paths of a specific class.
 */
public class ObtenerPreguntaFlujoParamIncorrectosNoEstan extends AbstractDbUnitJpaTest{

	@Test
	public void testGetDataPreguntaFlujoBasicoParametrosInCorrectosNoEstan() throws Exception{
		//fail("Not yet implemented");
		
		PreguntaLogic preguntaLogic = new PreguntaLogic(entityManager);
		List <PreguntaDTO> preguntas = preguntaLogic.getDataPregunta(5, 1);
		Assert.assertEquals(0, preguntas.size());
	}
	
}
