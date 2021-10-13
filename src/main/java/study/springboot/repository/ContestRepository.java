package study.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.springboot.entity.Contest;

@Repository
public interface ContestRepository extends JpaRepository<Contest, Long>{

}
