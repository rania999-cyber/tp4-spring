package com.springjava.poc.Service;


import com.springjava.poc.Entity.Staff;
import com.springjava.poc.Repository.StaffRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StaffServiceImp implements StaffService {
   @Autowired
   StaffRepo staffRepo;

   public StaffServiceImp() {
   }

   public void save(Staff staff) {
      if (staff.getId() == null) {
         this.staffRepo.save(staff);
      } else {
         Staff staffUpdate = (Staff)this.staffRepo.findById(staff.getId()).get();
         staffUpdate.setName(staff.getName());
         staffUpdate.setDesgn(staff.getDesgn());
         staffUpdate.setEmailId(staff.getEmailId());
         this.staffRepo.save(staffUpdate);
      }

   }

   public List<Staff> getAll() {
      return this.staffRepo.findAll();
   }

   public Staff getById(Integer id) {
      return (Staff)this.staffRepo.findById(id).get();
   }

   public void delete(Staff staff) {
      this.staffRepo.delete(staff);
   }
}
