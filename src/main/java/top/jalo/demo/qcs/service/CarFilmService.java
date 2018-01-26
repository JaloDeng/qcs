package top.jalo.demo.qcs.service;

import org.springframework.stereotype.Service;

import top.jalo.demo.qcs.entity.CarFilmEntity;
import top.jalo.demo.qcs.model.CarFilm;

/**
 * @author JALO
 *
 */
@Service
public class CarFilmService extends QCSTransactionalService<CarFilmEntity, CarFilm, Long, Long> {

	@Override
	protected CarFilmEntity createEntity(CarFilm model, CarFilmEntity referenceEntity, Boolean mergeIfNotNull,
			Object... args) throws Exception {
		if (model == null) {
			return null;
		}
		
		CarFilmEntity entity = referenceEntity == null ? new CarFilmEntity() : referenceEntity;
		
		if (!mergeIfNotNull && model.getNumberPlate() != null) {
			entity.setNumberPlate(model.getNumberPlate());
		}
		if (!mergeIfNotNull && model.getModel() != null) {
			entity.setModel(model.getModel());
		}
		if (!mergeIfNotNull && model.getPosition() != null) {
			entity.setPosition(model.getPosition());
		}
		if (!mergeIfNotNull && model.getProcessDate() != null) {
			entity.setProcessDate(model.getProcessDate());
		}
		if (!mergeIfNotNull && model.getQualityAssuranceCardNo() != null) {
			entity.setQualityAssuranceCardNo(model.getQualityAssuranceCardNo());
		}
		if (!mergeIfNotNull && model.getProcessCompany() != null) {
			entity.setProcessCompany(model.getProcessCompany());
		}
		
		return entity;
	}

	@Override
	protected CarFilm createModel(CarFilmEntity entity, Object... args) throws Exception {
		if (entity == null) {
			return null;
		}
		
		CarFilm model = new CarFilm();
		
		model.setId(entity.getId());
		model.setNumberPlate(entity.getNumberPlate());
		model.setModel(entity.getModel());
		model.setPosition(entity.getPosition());
		model.setProcessDate(entity.getProcessDate());
		model.setQualityAssuranceCardNo(entity.getQualityAssuranceCardNo());
		model.setProcessCompany(model.getProcessCompany());
		
		return model;
	}

}
