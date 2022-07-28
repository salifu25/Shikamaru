package techmedy.com.dinnani.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techmedy.com.dinnani.model.Documents;

@Repository
public interface DocumentsRepository extends JpaRepository<Documents,Long> {
}
