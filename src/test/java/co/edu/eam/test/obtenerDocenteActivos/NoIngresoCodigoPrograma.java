package co.edu.eam.test.obtenerDocenteActivos;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import co.edu.eam.ws.WebServiceClient;
import co.edu.eam.modelo.dto.DocenteDTO;

/**
 * @author Alvaro Lotero <lotero021095@gmail.com>
 * @author Santiago Idarraga <santiago-2108@hotmail.com>
 */

public class NoIngresoCodigoPrograma {

	@Test
	public void testNoIngresoCodigoPrograma_() {
		// fail("Not yet implemented");
		WebServiceClient ws = new WebServiceClient();
		List<DocenteDTO> doc = ws.consultarDocentesActivosPorPrograma("");
		Assert.assertEquals(0, doc.size());
	}
	
}
