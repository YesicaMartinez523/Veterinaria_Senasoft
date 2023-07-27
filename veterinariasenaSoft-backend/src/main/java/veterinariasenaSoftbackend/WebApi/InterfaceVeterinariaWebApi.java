package veterinariasenaSoftbackend.WebApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import veterinariasenaSoftbackend.commons.endpoints.InterfaceEndpointsVeterinaria;
import veterinariasenaSoftbackend.commons.entity.CitasVeterinariasEntity;

public interface InterfaceVeterinariaWebApi {

    @PostMapping (InterfaceEndpointsVeterinaria.CITAS_POR_REALIZAR)
    public ResponseEntity<?> CrearCitasVeterinaria(@RequestBody CitasVeterinariasEntity citasVeterinariasEntity);

}
