package cg.powesoft.mairiedepotopoto.server.repository;

import cg.powesoft.mairiedepotopoto.server.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface DocumentRepository extends JpaRepository<Document,Long> {
}
