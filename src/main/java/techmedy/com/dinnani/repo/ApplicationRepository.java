package techmedy.com.dinnani.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techmedy.com.dinnani.model.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application,Long> {

}
