package com.usta.nataly.Repository;

import com.usta.nataly.Entity.NombreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NombreRepository extends JpaRepository<NombreEntity, Long> {
}
