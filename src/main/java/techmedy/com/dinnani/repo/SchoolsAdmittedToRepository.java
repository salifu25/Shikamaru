package techmedy.com.dinnani.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techmedy.com.dinnani.model.SchoolsAdmittedTo;

@Repository
public interface SchoolsAdmittedToRepository extends JpaRepository<SchoolsAdmittedTo,Long> {
}
