package techmedy.com.dinnani.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techmedy.com.dinnani.model.ApplicantStatement;

@Repository
public interface ApplicantStatementRepository extends JpaRepository<ApplicantStatement,Long> {
}
