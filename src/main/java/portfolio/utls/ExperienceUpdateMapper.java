package portfolio.utls;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import portfolio.dto.AdminExperienceRequestDTO;
import portfolio.model.AdminExperience;

@Mapper(componentModel = "spring")
public interface ExperienceUpdateMapper {
	
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	void updateExperience(AdminExperienceRequestDTO adminExperienceRequestDTO, @MappingTarget AdminExperience experience);
}
