package top.jalo.demo.qcs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.jalo.commons.util.annotation.View;
import top.jalo.commons.webservice.controller.JpaGenericMVController;
import top.jalo.demo.qcs.entity.CarFilmEntity;
import top.jalo.demo.qcs.model.CarFilm;

/**
 * @author JALO
 *
 */
@RestController
@RequestMapping("/carfilm")
@View("/view/carfilm")
public class CarFilmController extends JpaGenericMVController<CarFilmEntity, CarFilm, Long, Long> {

}
