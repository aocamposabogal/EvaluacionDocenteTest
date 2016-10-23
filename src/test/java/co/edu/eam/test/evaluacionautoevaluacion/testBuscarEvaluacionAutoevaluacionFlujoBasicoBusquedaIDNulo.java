/**
 * 
 */
package co.edu.eam.test.evaluacionautoevaluacion;

import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTestEvaluacionAutoevaluacion;

import co.edu.eam.exceptions.ZMessManager;
import co.edu.eam.modelo.control.EvaluacionLogic;

/**
 * @author Daniel Giraldo <pipe_635@hotmail.com>
 *
 */
public class testBuscarEvaluacionAutoevaluacionFlujoBasicoBusquedaIDNulo extends AbstractDbUnitJpaTestEvaluacionAutoevaluacion  {

@Test (expected = ZMessManager.class)
public void testBuscarEvaluacionAutoevaluacionFlujoBasicoBusquedaIDNulo_() throws Exception {
		//fail("Not yet implemented");

			EvaluacionLogic evaluacionLogic = new EvaluacionLogic(entityManager);
			evaluacionLogic.getEvaluacion(null);

		
}
}
