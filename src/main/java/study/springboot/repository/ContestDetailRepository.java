package study.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.springboot.entity.ContestDetail;

@Repository
public interface ContestDetailRepository extends JpaRepository<ContestDetail, Long>{

}
