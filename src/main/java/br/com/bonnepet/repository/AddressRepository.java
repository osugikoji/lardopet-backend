package br.com.bonnepet.repository;

import br.com.bonnepet.domain.Address;
import br.com.bonnepet.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
