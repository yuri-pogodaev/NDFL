package ru.diasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.diasoft.model.Ndfl;

import java.util.UUID;

@Repository
public interface NdflRepository extends JpaRepository<Ndfl, UUID> {
}
