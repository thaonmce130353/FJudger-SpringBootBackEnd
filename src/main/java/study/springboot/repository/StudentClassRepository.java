package study.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.springboot.entity.StudentClass;

@Repository
public interface StudentClassRepository extends JpaRepository<StudentClass, Long>{

}
