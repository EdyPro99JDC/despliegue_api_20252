package jdc.edu.area_salud.repository;

import jdc.edu.area_salud.entity.EstatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstatusRepository extends JpaRepository<EstatusEntity, Long> {
}
