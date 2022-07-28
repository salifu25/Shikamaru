package techmedy.com.dinnani.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techmedy.com.dinnani.model.ApplicantFinancialInformation;

@Repository
public interface ApplicantFinancialInformationRepository extends JpaRepository<ApplicantFinancialInformation,Long> {
}
