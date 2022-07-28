package techmedy.com.dinnani.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techmedy.com.dinnani.model.SHSResult;

@Repository
public interface SHSResultRepository extends JpaRepository<SHSResult,Long> {

}
