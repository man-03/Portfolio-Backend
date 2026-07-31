package portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import portfolio.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

	public Admin findByUserName(String userName);
	public void deleteByUserName(String userName);
}
