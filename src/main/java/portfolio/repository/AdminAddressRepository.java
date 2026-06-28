package portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import portfolio.model.AdminAddress;

public interface AdminAddressRepository extends JpaRepository<AdminAddress, Long> {

}
