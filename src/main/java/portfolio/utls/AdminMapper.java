package portfolio.utls;

import org.springframework.stereotype.Component;

import portfolio.dto.AdminAddressRequestDTO;
import portfolio.dto.AdminAddressResponseDTO;
import portfolio.dto.AdminExperienceRequestDTO;
import portfolio.dto.AdminExperienceResponseDTO;
import portfolio.dto.AdminRequestDTO;
import portfolio.dto.AdminResponseDTO;
import portfolio.model.Admin;
import portfolio.model.AdminAddress;
import portfolio.model.AdminExperience;

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

    public AdminResponseDTO convertAdminToDTO(Admin admin, AdminAddressResponseDTO adminAddressResponseDTO) {

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
        dto.setAdminAddressResponseDTO(adminAddressResponseDTO);

        return dto;
    }

    public void updateAdmin(AdminRequestDTO dto, Admin admin) {

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
    
    public void updateAddress(AdminAddressRequestDTO dto, AdminAddress adminAddress) {

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
	}
    
    
    public AdminExperience convertDTOToAdminExperience(AdminExperienceRequestDTO dto) {

        AdminExperience experience = new AdminExperience();

        experience.setTitle(dto.getTitle());
        experience.setEmploymentType(dto.getEmploymentType());
        experience.setCompany(dto.getCompany());
        experience.setStartMonth(dto.getStartMonth());
        experience.setStartYear(dto.getStartYear());
        experience.setEndMonth(dto.getEndMonth());
        experience.setEndYear(dto.getEndYear());
        experience.setCurrentlyWorking(dto.getCurrentlyWorking());
        experience.setLocation(dto.getLocation());
        experience.setLocationType(dto.getLocationType());
        experience.setDescription(dto.getDescription());
        experience.setCompanyLogoUrl(dto.getCompanyLogoUrl());

        return experience;
    }
    
    public AdminExperienceResponseDTO convertAdminExperienceToDTO(AdminExperience experience) {

        AdminExperienceResponseDTO dto = new AdminExperienceResponseDTO();

        dto.setId(experience.getId());
        dto.setTitle(experience.getTitle());
        dto.setEmploymentType(experience.getEmploymentType());
        dto.setCompany(experience.getCompany());
        dto.setStartMonth(experience.getStartMonth());
        dto.setStartYear(experience.getStartYear());
        dto.setEndMonth(experience.getEndMonth());
        dto.setEndYear(experience.getEndYear());
        dto.setCurrentlyWorking(experience.getCurrentlyWorking());
        dto.setLocation(experience.getLocation());
        dto.setLocationType(experience.getLocationType());
        dto.setDescription(experience.getDescription());
        dto.setCompanyLogoUrl(experience.getCompanyLogoUrl());

        if (experience.getAdmin() != null) {
            dto.setAdminUser(experience.getAdmin().getUserName());
        }

        return dto;
    }
}
