package portfolio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import portfolio.model.AdminAddress;

public interface AdminAddressRepository extends JpaRepository<AdminAddress, Long> {

	Optional<AdminAddress> findByAdmin_UserName(String userName);

}
