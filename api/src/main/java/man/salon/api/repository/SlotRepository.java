package man.salon.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import man.salon.api.model.Slot;

public interface SlotRepository extends JpaRepository<Slot, Long> {
    
}
