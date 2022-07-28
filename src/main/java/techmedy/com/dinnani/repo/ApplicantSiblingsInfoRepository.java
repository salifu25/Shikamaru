package techmedy.com.dinnani.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techmedy.com.dinnani.model.ApplicantSiblingsInfo;

@Repository
public interface ApplicantSiblingsInfoRepository extends JpaRepository<ApplicantSiblingsInfo,Long> {
}
