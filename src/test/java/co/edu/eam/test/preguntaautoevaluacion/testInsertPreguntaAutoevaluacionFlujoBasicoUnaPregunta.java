/**
 * 
 */
package co.edu.eam.test.preguntaautoevaluacion;

import org.junit.Assert;
import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTest;
import com.eam.test.util.AbstractDbUnitJpaTestEvaluacionAutoevaluacion;
import com.eam.test.util.AbstractDbUnitJpaTestPreguntaAutoevaluacion;

import co.edu.eam.modelo.Periodo;
import co.edu.eam.modelo.Pregunta;
import co.edu.eam.modelo.TipoEvaluacion;
import co.edu.eam.modelo.control.PreguntaLogic;

/**
 * @author Daniel Giraldo <pipe_635@hotmail.com>
 *
 */
public class testInsertPreguntaAutoevaluacionFlujoBasicoUnaPregunta extends AbstractDbUnitJpaTestPreguntaAutoevaluacion {

	
	@Test
	public void testInsertPreguntaAutoevaluacionFlujoBasicoUnaPregunta_() {
		//fail("Not yet implemented");
		try{	
			PreguntaLogic preguntaLogic = new PreguntaLogic(entityManager);
			
			Pregunta pregunta = new Pregunta();
			pregunta.setEstado("1");
			pregunta.setId(3);
			Periodo periodo = new Periodo();
			periodo.setId(1);
			pregunta.setPeriodo(periodo);
			TipoEvaluacion tipoEvaluacion = new TipoEvaluacion();
			tipoEvaluacion.setId(1); // Este corresponderia a AUTOEVALUACION
			pregunta.setTipoEvaluacion(tipoEvaluacion);
			pregunta.setPregunta("Presenta las clases de manera dinamica");
			preguntaLogic.savePregunta(pregunta);
			Pregunta preguntaConsultada = entityManager.find(Pregunta.class, 3);
		
			Assert.assertNotNull(preguntaConsultada);
			Assert.assertEquals("Presenta las clases de manera dinamica", preguntaConsultada.getPregunta());
		}
		catch (Exception e){
			Assert.fail (e.getMessage());
		}
			
	}
}
