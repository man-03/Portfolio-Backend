package portfolio.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import portfolio.model.AdminExperience;

@Repository
public interface AdminExperienceRepository extends JpaRepository<AdminExperience, Long> {

	public List<AdminExperience> findByAdmin_UserName(String userName);
	public Optional<AdminExperience> findByIdAndAdmin_UserName(Long experienceId, String userName);
}
