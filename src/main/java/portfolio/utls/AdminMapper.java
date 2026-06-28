package portfolio.utls;

import org.springframework.stereotype.Component;

import portfolio.dto.AdminAddressRequestDTO;
import portfolio.dto.AdminAddressResponseDTO;
import portfolio.dto.AdminRequestDTO;
import portfolio.dto.AdminResponseDTO;
import portfolio.model.Admin;
import portfolio.model.AdminAddress;

@Component
public class AdminMapper {

	//Admin
    public Admin convertDTOToAdmin(AdminRequestDTO dto) {

        Admin admin = new Admin();

        admin.setUserName(dto.getUserName());
        admin.setFirstName(dto.getFirstName());
        admin.setLastName(dto.getLastName());
        admin.setDateOfBirth(dto.getDateOfBirth());
        admin.setPronoun(dto.getPronoun());
        admin.setCurrentPosition(dto.getCurrentPosition());
        admin.setMyQuote(dto.getMyQuote());
        admin.setHeadLine(dto.getHeadLine());
        admin.setAbout(dto.getAbout());
        admin.setProfileImageUrl(dto.getProfileImageUrl());
        admin.setPassword(dto.getPassword());

        return admin;
    }

    public AdminResponseDTO convertAdminToDTO(Admin admin) {

        AdminResponseDTO dto = new AdminResponseDTO();

        dto.setUserName(admin.getUserName());
        dto.setFirstName(admin.getFirstName());
        dto.setLastName(admin.getLastName());
        dto.setDateOfBirth(admin.getDateOfBirth());
        dto.setPronoun(admin.getPronoun());
        dto.setCurrentPosition(admin.getCurrentPosition());
        dto.setMyQuote(admin.getMyQuote());
        dto.setHeadLine(admin.getHeadLine());
        dto.setAbout(admin.getAbout());
        dto.setProfileImageUrl(admin.getProfileImageUrl());

        return dto;
    }

    public Admin updateAdmin(AdminRequestDTO dto, Admin admin) {

        if (dto.getFirstName() != null) {
            admin.setFirstName(dto.getFirstName());
        }

        if (dto.getLastName() != null) {
            admin.setLastName(dto.getLastName());
        }

        if (dto.getDateOfBirth() != null) {
            admin.setDateOfBirth(dto.getDateOfBirth());
        }

        if (dto.getPronoun() != null) {
            admin.setPronoun(dto.getPronoun());
        }

        if (dto.getCurrentPosition() != null) {
            admin.setCurrentPosition(dto.getCurrentPosition());
        }

        if (dto.getMyQuote() != null) {
            admin.setMyQuote(dto.getMyQuote());
        }

        if (dto.getHeadLine() != null) {
            admin.setHeadLine(dto.getHeadLine());
        }

        if (dto.getAbout() != null) {
            admin.setAbout(dto.getAbout());
        }
        
        if (dto.getProfileImageUrl() != null) {
        	admin.setProfileImageUrl(dto.getProfileImageUrl());
        }

        if (dto.getPassword() != null) {
            admin.setPassword(dto.getPassword());
        }

        return admin;
    }
    
    public AdminAddress convertDTOToAddress(AdminAddressRequestDTO adminAddressRequestDTO) {
    	
    	AdminAddress adminAddress = new AdminAddress();
    	
    	adminAddress.setAddress(adminAddressRequestDTO.getAddress());
    	adminAddress.setCountry(adminAddressRequestDTO.getCountry());
    	adminAddress.setState(adminAddressRequestDTO.getState());
    	adminAddress.setCity(adminAddressRequestDTO.getCity());
    	adminAddress.setZip(adminAddressRequestDTO.getZip());
    	
    	return adminAddress;
    }
    
    public AdminAddressResponseDTO convertAddressToDTO(AdminAddress adminAddress) {

        AdminAddressResponseDTO dto = new AdminAddressResponseDTO();

        dto.setId(adminAddress.getId());
        dto.setAddress(adminAddress.getAddress());
        dto.setCountry(adminAddress.getCountry());
        dto.setState(adminAddress.getState());
        dto.setCity(adminAddress.getCity());
        dto.setZip(adminAddress.getZip());

        return dto;
    }
    
    public AdminAddress updateAddress(AdminAddressRequestDTO dto, AdminAddress adminAddress) {

		if (dto.getAddress() != null) {
		adminAddress.setAddress(dto.getAddress());
		}
		
		if (dto.getCountry() != null) {
		adminAddress.setCountry(dto.getCountry());
		}
		
		if (dto.getState() != null) {
		adminAddress.setState(dto.getState());
		}
		
		if (dto.getCity() != null) {
		adminAddress.setCity(dto.getCity());
		}
		
		if (dto.getZip() != null) {
		adminAddress.setZip(dto.getZip());
		}
		
		return adminAddress;
	}
}
