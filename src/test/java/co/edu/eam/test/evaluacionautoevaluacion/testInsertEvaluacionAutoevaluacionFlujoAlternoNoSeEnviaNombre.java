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
import co.edu.eam.modelo.TipoEvaluacion;
import co.edu.eam.modelo.control.EvaluacionLogic;

/**
 * @author Daniel Giraldo <pipe_635@hotmail.com>
 *
 */
public class testInsertEvaluacionAutoevaluacionFlujoAlternoNoSeEnviaNombre extends AbstractDbUnitJpaTestEvaluacionAutoevaluacion {

	@Test (expected = ZMessManager.class)
	public void testInsertEvaluacionAutoevaluacionFlujoAlternoNoSeEnviaNombre_() throws Exception {
		//fail("Not yet implemented");
		EvaluacionLogic evaluacionLogic = new EvaluacionLogic(entityManager);
		Evaluacion evaluacion = new Evaluacion();

		evaluacion.setId(3);
		Periodo periodo = new Periodo();
		periodo.setId(1);
		evaluacion.setPeriodo(periodo);
		ProgramaAcademico programaAcademico = new ProgramaAcademico();
		programaAcademico.setId(1); 
		evaluacion.setProgramaAcademico(programaAcademico);
		TipoEvaluacion tipoEvaluacion = new TipoEvaluacion();
		tipoEvaluacion.setId(1); // Este corresponderia a AUTOEVALUACION
		evaluacion.setTipoEvaluacion(tipoEvaluacion);
		evaluacionLogic.saveEvaluacion(evaluacion);
	}
	
}
