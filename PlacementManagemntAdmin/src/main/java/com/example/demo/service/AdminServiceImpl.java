package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin saveAdmin(Admin admin){
		 return adminRepository.save(admin);
	}

	@Override
	public List<Admin> fetchAdminList() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public Admin fetchAdminById(Long id) {
		// TODO Auto-generated method stub
		 return adminRepository.findById(id).get();
	
	}

	@Override
	public void deleteAdminById(Long id) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(id);
		
	}

	@Override
	public Admin updateAdmin(Long id, Admin admin) {
		Admin adDB = adminRepository.findById(id).get();

	       if(Objects.nonNull(admin.getName()) &&
	       !"".equalsIgnoreCase(admin.getName())) {
	           adDB.setName(admin.getName());
	       }

	       if(Objects.nonNull(admin.getPassword()) &&
	               !"".equalsIgnoreCase(admin.getPassword())) {
	           adDB.setPassword(admin.getPassword());
	       }

	       return adminRepository.save(adDB);
	}

	

}
