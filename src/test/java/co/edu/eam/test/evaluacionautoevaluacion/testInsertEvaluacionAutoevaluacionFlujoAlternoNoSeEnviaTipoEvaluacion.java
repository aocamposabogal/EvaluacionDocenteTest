/**
 * 
 */
package co.edu.eam.test.evaluacionautoevaluacion;

import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTestEvaluacionAutoevaluacion;

import co.edu.eam.exceptions.ZMessManager;
import co.edu.eam.modelo.Evaluacion;
import co.edu.eam.modelo.Periodo;
import co.edu.eam.modelo.ProgramaAcademico;
import co.edu.eam.modelo.control.EvaluacionLogic;

/**
 * @author Daniel Giraldo <pipe_635@hotmail.com>
 *
 */
public class testInsertEvaluacionAutoevaluacionFlujoAlternoNoSeEnviaTipoEvaluacion extends AbstractDbUnitJpaTestEvaluacionAutoevaluacion {
 
	@Test (expected = ZMessManager.class)
	public void testInsertEvaluacionAutoevaluacionFlujoAlternoNoSeEnviaTipoEvaluacion_() throws Exception {
		//fail("Not yet implemented");
		
		EvaluacionLogic preguntaLogic = new EvaluacionLogic(entityManager);
		
		Evaluacion evaluacion = new Evaluacion();
		evaluacion.setNombre("Evaluacion 0001");
		evaluacion.setId(3);
		Periodo periodo = new Periodo();
		periodo.setId(1);
		evaluacion.setPeriodo(periodo);
		ProgramaAcademico programaAcademico = new ProgramaAcademico();
		programaAcademico.setId(1); 
		evaluacion.setProgramaAcademico(programaAcademico);
		preguntaLogic.saveEvaluacion(evaluacion);			
	}
}
