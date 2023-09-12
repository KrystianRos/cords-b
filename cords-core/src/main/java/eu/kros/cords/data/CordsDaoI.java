package eu.kros.cords.data;

import eu.kros.cords.data.entities.CordsBE;

import java.util.List;

public interface CordsDaoI {
  List<CordsBE> findAll();
}
