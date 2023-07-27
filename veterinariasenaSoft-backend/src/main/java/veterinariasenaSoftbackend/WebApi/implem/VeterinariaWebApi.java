package veterinariasenaSoftbackend.WebApi.implem;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import veterinariasenaSoftbackend.WebApi.InterfaceVeterinariaWebApi;
import veterinariasenaSoftbackend.commons.endpoints.InterfaceEndpointsVeterinaria;
import veterinariasenaSoftbackend.commons.entity.CitasVeterinariasEntity;
import veterinariasenaSoftbackend.service.implem.VeterinariaService;

@RestController
@RequestMapping (InterfaceEndpointsVeterinaria.URL_BASE_VETERINARIA)
public class VeterinariaWebApi  implements InterfaceVeterinariaWebApi {

    private final VeterinariaService veterinariaService;

    public VeterinariaWebApi(VeterinariaService veterinariaService) {
        this.veterinariaService = veterinariaService;
    }

    @Override
    public ResponseEntity<?> CrearCitasVeterinaria(CitasVeterinariasEntity citasVeterinariasEntity) {
        System.out.println("pruebas Datos" + citasVeterinariasEntity.getNombreAnimal());
        CitasVeterinariasEntity citaCreada = this.veterinariaService.crearCita(citasVeterinariasEntity);
        return ResponseEntity.ok().body(citaCreada);
    }
}
