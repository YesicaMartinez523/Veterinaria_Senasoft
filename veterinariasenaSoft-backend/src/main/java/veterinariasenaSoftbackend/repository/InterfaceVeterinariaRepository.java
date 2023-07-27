package veterinariasenaSoftbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veterinariasenaSoftbackend.commons.entity.CitasVeterinariasEntity;

public interface InterfaceVeterinariaRepository extends JpaRepository  <CitasVeterinariasEntity,Integer> {
}
