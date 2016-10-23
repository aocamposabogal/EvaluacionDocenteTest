/**
 * 
 */
package co.edu.eam.test.preguntaautoevaluacion;

import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTestEvaluacionAutoevaluacion;
import com.eam.test.util.AbstractDbUnitJpaTestPreguntaAutoevaluacion;

import co.edu.eam.exceptions.ZMessManager;
import co.edu.eam.modelo.Pregunta;
import co.edu.eam.modelo.control.PreguntaLogic;

/**
 * @author Daniel Giraldo <pipe_635@hotmail.com>
 *
 */
public class testInsertPreguntaAutoevaluacionFlujoAlternoPreguntaNula extends AbstractDbUnitJpaTestPreguntaAutoevaluacion {

	@Test (expected = ZMessManager.class)
	public void testInsertPreguntaAutoevaluacionFlujoAlternoPreguntaNula_() throws Exception {
		//fail("Not yet implemented");
		
			PreguntaLogic preguntaLogic = new PreguntaLogic(entityManager);
			
			Pregunta pregunta = new Pregunta();
			preguntaLogic.savePregunta(pregunta);
	
	}
}
