package study.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.springboot.entity.Classes;

@Repository
public interface ClassRepository extends JpaRepository<Classes, Long>{

}
