package veterinariasenaSoftbackend.service.implem;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import veterinariasenaSoftbackend.commons.entity.CitasVeterinariasEntity;
import veterinariasenaSoftbackend.repository.InterfaceVeterinariaRepository;
import veterinariasenaSoftbackend.service.InterfaceVeterinariaService;

@Component
public class VeterinariaService  implements InterfaceVeterinariaService
{
    private final InterfaceVeterinariaRepository interfaceVeterinariaRepository;

    public VeterinariaService(InterfaceVeterinariaRepository interfaceVeterinariaRepository) {
        this.interfaceVeterinariaRepository = interfaceVeterinariaRepository;

    }

    @Override
    public CitasVeterinariasEntity crearCita(CitasVeterinariasEntity citasVeterinariasEntity) {
        System.out.println("Validar envio" + citasVeterinariasEntity.getNombreAnimal());
        return this.interfaceVeterinariaRepository.save(citasVeterinariasEntity);
    }
}
