package co.edu.eam.test.coevaluacionrespuesta;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTest;

import co.edu.eam.exceptions.ZMessManager;
import co.edu.eam.modelo.Periodo;
import co.edu.eam.modelo.Pregunta;
import co.edu.eam.modelo.TipoEvaluacion;
import co.edu.eam.modelo.control.PreguntaLogic;
import co.edu.eam.modelo.control.RespuestaLogic;
import co.edu.eam.modelo.dto.PreguntaDTO;
import co.edu.eam.modelo.dto.RespuestaDTO;

/**
 * Unit test for Hello.
 * <p/>
 * A unit test aims to test all code and code paths of a specific class.
 */
public class ObtenerRespuestaFlujoBasicoTestDatosNoegativos extends AbstractDbUnitJpaTest{

	@Test
	public void testObtenerRespuestaNumeroNegativos() {
		//fail("Not yet implemented");
		try{	
			RespuestaLogic respuestaLogic = new RespuestaLogic(entityManager);
			List<RespuestaDTO> respuestaConsultada =respuestaLogic.getDataRespuesta(-1, -1);
			Assert.assertNotNull(respuestaConsultada);
			Assert.assertEquals(0, respuestaConsultada.size());
		}
		catch (Exception e){
			Assert.fail (e.getMessage());
		}
			
	}
	
	
}
