/**
 * 
 */
package co.edu.eam.test.consultarmateriasporcodestudiante;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.eam.test.util.AbstractDbUnitJpaTestEvaluacionAutoevaluacion;
import com.eam.test.util.AbstractDbUnitJpaTestPreguntaAutoevaluacion;
import com.geowarin.hibernate.jpa.standalone.model.User;

import co.edu.eam.exceptions.ZMessManager;
import co.edu.eam.modelo.Pregunta;
import co.edu.eam.modelo.TipoEvaluacion;
import co.edu.eam.modelo.control.PreguntaLogic;
import co.edu.eam.modelo.dto.MateriaDTO;
import co.edu.eam.ws.WebServiceClient;

/**
 * @author Daniel Giraldo <pipe_635@hotmail.com>
 *
 */
public class testFindConsultarMateriasCodigoEstudiante extends AbstractDbUnitJpaTestPreguntaAutoevaluacion {


	
	@Test
	public void testConsultarMateriasCodigoEstudianteFlujoAlternoCodigoIncorrecto() {
		

		WebServiceClient webService = new WebServiceClient();
		
		List<MateriaDTO> listMaterias = webService.consultarMateriasPorCodigoEstudiante("22877");
		Assert.assertEquals(0, listMaterias.size());
	}
	
	/***********************************************************************/
	
	
	
	@Test
	public void testConsultarMateriasCodigoEstudianteFlujoAlternoCodigoCorrecto() {
		

		WebServiceClient webService = new WebServiceClient();
		
		List<MateriaDTO> listMaterias = webService.consultarMateriasPorCodigoEstudiante("2320131013");
		Assert.assertEquals(6, listMaterias.size());
	}
}
