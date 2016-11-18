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

public class BusquedaDocentesActivos {

	@Test
	public void testBuscarDocentesActivosPorPrograma_() {
		// fail("Not yet implemented");
		WebServiceClient ws = new WebServiceClient();
		List<DocenteDTO> doc = ws.consultarDocentesActivosPorPrograma("23");
		Assert.assertEquals(14, doc.size());
	}

}
