package veterinariasenaSoftbackend.service;

import org.springframework.http.ResponseEntity;
import veterinariasenaSoftbackend.commons.entity.CitasVeterinariasEntity;

public interface InterfaceVeterinariaService {
    public CitasVeterinariasEntity crearCita (CitasVeterinariasEntity citasVeterinariasEntity);
}
