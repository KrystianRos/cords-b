package eu.kros.cords.services;

import eu.kros.cords.data.CordsDaoI;
import eu.kros.cords.data.entities.CordsBE;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Qualifier;

import java.util.List;

@ApplicationScoped
public class CordsService {

  @Inject
  @Named("mockCordsDao")
  CordsDaoI cordsDao;

  public List<CordsBE> getAllCords() {
    return cordsDao.findAll();
  }

}
