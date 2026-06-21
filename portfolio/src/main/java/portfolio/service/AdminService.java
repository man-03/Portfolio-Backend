package portfolio.service;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import portfolio.dto.AdminDTO;
import portfolio.model.Admin;
import portfolio.repository.AdminRepository;
import portfolio.utls.AdminMapper;

@Service
public class AdminService {

    private final AdminRepository adminRepository;
    private final AdminMapper adminMapper;

    public AdminService(AdminRepository adminRepository, AdminMapper adminMapper) {
        this.adminRepository = adminRepository;
        this.adminMapper = adminMapper;
    }

    public AdminDTO createAdmin(AdminDTO adminDTO) {
        Admin adminSave = adminMapper.convertToEntity(adminDTO);
        Admin savedAdmin = adminRepository.save(adminSave);
        return adminMapper.convertToDTO(savedAdmin);
    }

    public AdminDTO getAdmin(String userName) {
        Admin getAdmin = adminRepository.findByUserName(userName);
        return adminMapper.convertToDTO(getAdmin);
    }

    public AdminDTO updateAdmin(AdminDTO adminDTO) {
        Admin adminUpdate = adminRepository.findByUserName(adminDTO.getUserName());
        Admin updatedAdmin = adminMapper.updateEntity(adminDTO, adminUpdate);
        updatedAdmin = adminRepository.save(updatedAdmin);
        return adminMapper.convertToDTO(updatedAdmin);
    }

    @Transactional
    public void deleteAdmin(String userName) {
        adminRepository.deleteByUserName(userName);
    }
}