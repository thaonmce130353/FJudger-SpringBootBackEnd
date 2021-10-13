package study.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.springboot.entity.ContestStudent;

@Repository
public interface ContestStudentRepository extends JpaRepository<ContestStudent, Long>{

}
