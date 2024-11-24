package com.SRFoods.Online.Food.Ordering.repository;

import com.SRFoods.Online.Food.Ordering.model.Address;
import com.SRFoods.Online.Food.Ordering.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
