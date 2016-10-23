/**
 * 
 */
package co.edu.eam.test.preguntaautoevaluacion;

import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTestEvaluacionAutoevaluacion;
import com.eam.test.util.AbstractDbUnitJpaTestPreguntaAutoevaluacion;

import co.edu.eam.exceptions.ZMessManager;
import co.edu.eam.modelo.Periodo;
import co.edu.eam.modelo.Pregunta;
import co.edu.eam.modelo.TipoEvaluacion;
import co.edu.eam.modelo.control.PreguntaLogic;

/**
 * @author Daniel Giraldo <pipe_635@hotmail.com>
 *
 */
public class testInsertPreguntaAutoevaluacionFlujoAlternoIdNegativo extends AbstractDbUnitJpaTestPreguntaAutoevaluacion {

	
	@Test (expected = ZMessManager.class)
	public void testInsertPreguntaAutoevaluacionFlujoAlternoIdNegativo_() throws Exception {

		//fail("Not yet implemented");
		
			PreguntaLogic preguntaLogic = new PreguntaLogic(entityManager);
			
			Pregunta pregunta = new Pregunta();
			pregunta.setEstado("1");
			pregunta.setId(-1);
			Periodo periodo = new Periodo();
			periodo.setId(1);
			pregunta.setPeriodo(periodo);
			TipoEvaluacion tipoEvaluacion = new TipoEvaluacion();
			tipoEvaluacion.setId(1);
			pregunta.setTipoEvaluacion(tipoEvaluacion);
			pregunta.setPregunta("Presenta las clases de manera dinamica");
			preguntaLogic.savePregunta(pregunta);
		
	}
}
