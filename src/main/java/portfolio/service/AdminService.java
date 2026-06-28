package portfolio.service;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import portfolio.dto.AdminRequestDTO;
import portfolio.dto.AdminResponseDTO;
import portfolio.model.Admin;
import portfolio.model.AdminAddress;
import portfolio.repository.AdminRepository;
import portfolio.utls.AdminMapper;
import portfolio.utls.ApiResponse;

@Service
public class AdminService {

    private final AdminRepository adminRepository;
    private final AdminAddressService adminAddressService;
    private final AdminMapper adminMapper;

    public AdminService(AdminRepository adminRepository, AdminAddressService adminAddressService, AdminMapper adminMapper) {
        this.adminRepository = adminRepository;
        this.adminAddressService = adminAddressService;
        this.adminMapper = adminMapper;
    }

    public ApiResponse createAdmin(AdminRequestDTO adminDTO) {
        Admin adminSave = adminMapper.convertDTOToAdmin(adminDTO);
        AdminAddress address = adminAddressService.createAddress(adminDTO.getAdminAddressRequestDTO());
        adminSave.setAdminAddress(address);
        adminRepository.save(adminSave);
        return new ApiResponse("True", "Admin Saved Successfully");
    }

    public AdminResponseDTO getAdmin(String userName) {
        Admin getAdmin = adminRepository.findByUserName(userName);
        return adminMapper.convertAdminToDTO(getAdmin);
    }

    public ApiResponse updateAdmin(AdminRequestDTO adminDTO, String userName) {
        Admin adminUpdate = adminRepository.findByUserName(userName);
        Admin updatedAdmin = adminMapper.updateAdmin(adminDTO, adminUpdate);
        adminRepository.save(updatedAdmin);
        return new ApiResponse("Success", "Admin Updated Successfully");
    }

    @Transactional
    public ApiResponse deleteAdmin(String userName) {
        adminRepository.deleteByUserName(userName);
        return new ApiResponse("Success", "Admin Deleted Successfully");
    }
}