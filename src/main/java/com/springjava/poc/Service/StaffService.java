package com.springjava.poc.Service;

import com.springjava.poc.Entity.Staff;
import java.util.List;

public interface StaffService {
void save(Staff staff);
List<Staff> getAll();
Staff getById(Integer id);
void delete(Staff staff);
}
