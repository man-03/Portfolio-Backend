package portfolio.service;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import portfolio.dto.AdminAddressRequestDTO;
import portfolio.dto.AdminAddressResponseDTO;
import portfolio.model.Admin;
import portfolio.model.AdminAddress;
import portfolio.repository.AdminAddressRepository;
import portfolio.utls.AdminMapper;
import portfolio.utls.ApiResponse;

@Service
public class AdminAddressService {
	
	private AdminAddressRepository adminAddressRepository;
	private AdminMapper adminMapper;
	
	public AdminAddressService (AdminAddressRepository adminAddressRepository, AdminMapper adminMapper) {
		this.adminAddressRepository = adminAddressRepository;
		this.adminMapper = adminMapper;
	}
	
	public ApiResponse createAddress(AdminAddressRequestDTO adminAddressRequestDTO, Admin admin) {
		AdminAddress address = adminMapper.convertDTOToAddress(adminAddressRequestDTO);
		address.setAdmin(admin);
		adminAddressRepository.save(address);
		return new ApiResponse("True", "Address Saved Successfully");
	}

	public AdminAddressResponseDTO getAddress(String userName) {
		AdminAddress address = adminAddressRepository.findByAdmin_UserName(userName)
				.orElseThrow(() -> new RuntimeException("Address Not Found"));
		return adminMapper.convertAddressToDTO(address);
	}
	
	public ApiResponse updateAddress(AdminAddressRequestDTO adminAddressRequestDTO, Long id) {
		AdminAddress address = adminAddressRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Addres Not Found"));
		adminMapper.updateAddress(adminAddressRequestDTO, address);
		return new ApiResponse("True", "Address Updated Successfully");
	}
	
	@Transactional
	public ApiResponse deleteAddress(Long id) {
		adminAddressRepository.deleteById(id);
		return new ApiResponse("Success", "Admin Deleted Successfully");
	}
	
}
