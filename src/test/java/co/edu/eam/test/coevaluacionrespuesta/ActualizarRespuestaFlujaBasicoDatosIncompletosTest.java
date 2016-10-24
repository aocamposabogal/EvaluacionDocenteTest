package co.edu.eam.test.coevaluacionrespuesta;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTest;

import co.edu.eam.exceptions.ZMessManager;
import co.edu.eam.modelo.Periodo;
import co.edu.eam.modelo.Pregunta;
import co.edu.eam.modelo.Presentacion;
import co.edu.eam.modelo.Respuesta;
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
public class ActualizarRespuestaFlujaBasicoDatosIncompletosTest extends AbstractDbUnitJpaTest{

	@Test (expected = ZMessManager.class)
	public void testActualizarRespuestaFlujaBasicoDatosIncompletosCompletos() throws Exception {
		//fail("Not yet implemented");
			
			RespuestaLogic respuestaLogic = new RespuestaLogic(entityManager);
			Respuesta entity = new Respuesta();
			entity.setId(1);
			entity.setNota(5);
			Pregunta pregunta = new Pregunta();
			pregunta.setId(1);
			entity.setPregunta(pregunta);			
			respuestaLogic.updateRespuesta(entity);
			
		
			
	}
	
	
}
