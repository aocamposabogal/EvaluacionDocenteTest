/**
 * 
 */
package co.edu.eam.test.evaluacionautoevaluacion;

import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTestEvaluacionAutoevaluacion;

import co.edu.eam.exceptions.ZMessManager;
import co.edu.eam.modelo.Periodo;
import co.edu.eam.modelo.Pregunta;
import co.edu.eam.modelo.TipoEvaluacion;
import co.edu.eam.modelo.control.PreguntaLogic;

/**
 * @author Daniel Giraldo <pipe_635@hotmail.com>
 *
 */
public class testInsertEvaluacionAutoevaluacionFlujoAlternoIDRepetido extends AbstractDbUnitJpaTestEvaluacionAutoevaluacion{


	@Test (expected = ZMessManager.class)
	public void testInsertEvaluacionAutoevaluacionFlujoAlternoIDRepetido_() throws Exception {

		//fail("Not yet implemented");
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
		preguntaLogic.savePregunta(pregunta);// En esta se crea otra pregunta con el mismo ID
		
	}
	
}
