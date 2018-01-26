package top.jalo.demo.qcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import top.jalo.demo.qcs.entity.CarFilmEntity;

/**
 * @author JALO
 *
 */
public interface CarFilmRepository extends JpaRepository<CarFilmEntity, Long>, JpaSpecificationExecutor<CarFilmEntity> {

}
