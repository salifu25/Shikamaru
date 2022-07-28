package techmedy.com.dinnani.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techmedy.com.dinnani.model.JHSResult;

@Repository
public interface JHSResultRepository extends JpaRepository<JHSResult,Long> {
}
