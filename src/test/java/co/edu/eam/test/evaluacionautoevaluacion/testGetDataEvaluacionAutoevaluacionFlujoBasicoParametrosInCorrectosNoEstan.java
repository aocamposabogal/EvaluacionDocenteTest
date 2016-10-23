/**
 * 
 */
package co.edu.eam.test.evaluacionautoevaluacion;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTestEvaluacionAutoevaluacion;

import co.edu.eam.modelo.control.EvaluacionLogic;
import co.edu.eam.modelo.dto.EvaluacionDTO;

/**
 * @author Daniel Giraldo <pipe_635@hotmail.com>
 *
 */
public class testGetDataEvaluacionAutoevaluacionFlujoBasicoParametrosInCorrectosNoEstan extends AbstractDbUnitJpaTestEvaluacionAutoevaluacion {

	@Test
	public void testGetDataEvaluacionAutoevaluacionFlujoBasicoParametrosInCorrectosNoEstan_() throws Exception{
		//fail("Not yet implemented");
		
		EvaluacionLogic evaluacionLogic = new EvaluacionLogic(entityManager);
		List <EvaluacionDTO> evaluaiones = evaluacionLogic.getDataEvaluacion();
		Assert.assertEquals(evaluaiones.size()>=0, evaluaiones.size());
	}
}
