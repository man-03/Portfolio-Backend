package portfolio.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import portfolio.dto.AdminAddressResponseDTO;
//import portfolio.dto.AdminAddressRequestDTO;
import portfolio.service.AdminAddressService;

@RestController
@RequestMapping("/api")
public class AdminAddressController {
	
	private AdminAddressService adminAddressService;

	public AdminAddressController(AdminAddressService adminAddressService) {
		this.adminAddressService = adminAddressService;
	}

//	@PostMapping("/address")
//	public ResponseEntity<ApiResponse> createAddress(@RequestBody AdminAddressRequestDTO adminAddressRequestDTO) {
//		ApiResponse response = adminAddressService.createAddress(adminAddressRequestDTO);
//	}
	
	@GetMapping("/address/{id}")
	public ResponseEntity<AdminAddressResponseDTO> getAddress(@PathVariable Long id) {
		 AdminAddressResponseDTO response = adminAddressService.getAddress(id);
		 return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
	}
	
}
