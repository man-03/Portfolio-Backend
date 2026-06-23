package portfolio.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import portfolio.dto.AdminDTO;
import portfolio.service.AdminService;

@RestController
@RequestMapping("/api")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/save")
    public ResponseEntity<AdminDTO> createAdmin(@RequestBody AdminDTO adminDTO) {
        AdminDTO response = adminService.createAdmin(adminDTO);
        return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
    }

    @GetMapping("/admin/{userName}")
    public ResponseEntity<AdminDTO> getAdmin(@PathVariable String userName) {
        AdminDTO response = adminService.getAdmin(userName);
        return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
    }

    @PutMapping("/update")
    public ResponseEntity<AdminDTO> updateAdmin(@RequestBody AdminDTO adminDTO) {
        AdminDTO response = adminService.updateAdmin(adminDTO);
        return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
    }

    @DeleteMapping("/{userName}")
    public ResponseEntity<String> deleteAdmin(@PathVariable String userName) {
        adminService.deleteAdmin(userName);
        return ResponseEntity.ok("Admin deleted successfully");
    }
}