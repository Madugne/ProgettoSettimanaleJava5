package chunyin.ProgettoSettimanale5.repositories;

import chunyin.ProgettoSettimanale5.entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DeviceRepository extends JpaRepository <Device, UUID> {
}
