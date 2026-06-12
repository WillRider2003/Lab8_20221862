package org.example.lab8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface equipoRepository extends JpaRepository<Equipos, Integer> {
    boolean existsByDocument(String document);
    boolean existsByDocumentAndIdNot(String document, Integer id);
}
