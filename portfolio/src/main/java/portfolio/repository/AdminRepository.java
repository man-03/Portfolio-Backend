package portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import portfolio.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

	public Admin findByUserName(String userName);
	public void deleteByUserName(String userName);
}
