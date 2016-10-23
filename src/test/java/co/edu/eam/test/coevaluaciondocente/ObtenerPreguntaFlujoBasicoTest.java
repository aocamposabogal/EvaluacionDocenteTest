package co.edu.eam.test.coevaluaciondocente;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTest;

import co.edu.eam.exceptions.ZMessManager;
import co.edu.eam.modelo.Periodo;
import co.edu.eam.modelo.Pregunta;
import co.edu.eam.modelo.TipoEvaluacion;
import co.edu.eam.modelo.control.PreguntaLogic;
import co.edu.eam.modelo.dto.PreguntaDTO;

/**
 * Unit test for Hello.
 * <p/>
 * A unit test aims to test all code and code paths of a specific class.
 */
public class ObtenerPreguntaFlujoBasicoTest extends AbstractDbUnitJpaTest{

	@Test
	public void testInsertPreguntaFlujoBasicoUnaPregunta() {
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
			tipoEvaluacion.setId(1);
			pregunta.setTipoEvaluacion(tipoEvaluacion);
			pregunta.setPregunta("Creo que ya despertaron!");
			preguntaLogic.savePregunta(pregunta);
			Pregunta preguntaConsultada = entityManager.find(Pregunta.class, 3);
		
			Assert.assertNotNull(preguntaConsultada);
			Assert.assertEquals("Creo que ya despertaron!", preguntaConsultada.getPregunta());
		}
		catch (Exception e){
			Assert.fail (e.getMessage());
		}
			
	}
	
	@Test (expected = ZMessManager.class)
	public void testInsertPreguntaFlujoAlternoNoSeEnviaPeriodo() throws Exception {
		//fail("Not yet implemented");
		
			PreguntaLogic preguntaLogic = new PreguntaLogic(entityManager);
			
			Pregunta pregunta = new Pregunta();
			pregunta.setEstado("1");
			pregunta.setId(3);
			TipoEvaluacion tipoEvaluacion = new TipoEvaluacion();
			tipoEvaluacion.setId(1);
			pregunta.setTipoEvaluacion(tipoEvaluacion);
			pregunta.setPregunta("Creo que ya despertaron!");
			preguntaLogic.savePregunta(pregunta);
		
	}
	
	@Test
	public void testGetDataPreguntaFlujoBasicoParametrosCorrectos() throws Exception{
		//fail("Not yet implemented");
		
		PreguntaLogic preguntaLogic = new PreguntaLogic(entityManager);
		List <PreguntaDTO> preguntas = preguntaLogic.getDataPregunta(1, 1);
		Assert.assertEquals(2, preguntas.size());
	}
	
	@Test
	public void testGetDataPreguntaFlujoBasicoParametrosInCorrectosNegativos() throws Exception{
		//fail("Not yet implemented");
		
		PreguntaLogic preguntaLogic = new PreguntaLogic(entityManager);
		List <PreguntaDTO> preguntas = preguntaLogic.getDataPregunta(-1, -1);
		Assert.assertEquals(0, preguntas.size());
	}
	
	@Test
	public void testGetDataPreguntaFlujoBasicoParametrosInCorrectosNoEstan() throws Exception{
		//fail("Not yet implemented");
		
		PreguntaLogic preguntaLogic = new PreguntaLogic(entityManager);
		List <PreguntaDTO> preguntas = preguntaLogic.getDataPregunta(5, 1);
		Assert.assertEquals(0, preguntas.size());
	}
}
