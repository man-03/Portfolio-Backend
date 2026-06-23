package portfolio.utls;

import org.springframework.stereotype.Component;

import portfolio.dto.AdminRequestDTO;
import portfolio.dto.AdminResponseDTO;
import portfolio.model.Admin;

@Component
public class AdminMapper {

    public Admin convertToEntity(AdminRequestDTO dto) {

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

    public AdminResponseDTO convertToDTO(Admin admin) {

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

    public Admin updateEntity(AdminRequestDTO dto, Admin admin) {

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
}
