package techmedy.com.dinnani.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techmedy.com.dinnani.model.ApplicantParentInfo;

@Repository
public interface ApplicantParentInfoRepository extends JpaRepository<ApplicantParentInfo,Long> {
}
