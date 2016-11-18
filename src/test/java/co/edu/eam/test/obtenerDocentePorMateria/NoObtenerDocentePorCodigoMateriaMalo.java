package co.edu.eam.test.obtenerDocentePorMateria;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import co.edu.eam.ws.WebServiceClient;
import co.edu.eam.modelo.dto.DocenteDTO;

/**
 * @author Alvaro Lotero <lotero021095@gmail.com>
 * @author Santiago Idarraga <santiago-2108@hotmail.com>
 */

public class NoObtenerDocentePorCodigoMateriaMalo {

	@Test
	public void testNoDocentePorMateria_() {
		// fail("Not yet implemented");
		WebServiceClient ws = new WebServiceClient();
		List<DocenteDTO> doc = ws.consultarDocentesPorMateria("20785");
		Assert.assertEquals(0, doc.size());
	}
	
}
