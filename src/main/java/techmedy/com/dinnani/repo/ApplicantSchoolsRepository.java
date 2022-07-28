package techmedy.com.dinnani.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techmedy.com.dinnani.model.ApplicantSchools;

@Repository
public interface ApplicantSchoolsRepository extends JpaRepository<ApplicantSchools,Long> {
}
