package neyaj.ahmad.Spring_Boot_Crud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neyaj.ahmad.Spring_Boot_Crud.entity.*;
public interface StudentDao extends JpaRepository<Student, String> {
	

}
