package eu.kros.cords.data;

import eu.kros.cords.data.entities.CordsBE;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.List;

@Named("mockCordsDao")
@ApplicationScoped
public class MockCordsDao implements CordsDaoI {

  @Override
  public List<CordsBE> findAll() {
    return List.of(
            new CordsBE(10.1, 10.2),
            new CordsBE(20.1, 20.2)
    );
  }
}
