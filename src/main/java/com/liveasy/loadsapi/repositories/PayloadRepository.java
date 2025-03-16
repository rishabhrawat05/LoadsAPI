package com.liveasy.loadsapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.liveasy.loadsapi.models.Payload;

@Repository
public interface PayloadRepository extends JpaRepository<Payload, String> {

	@Query("SELECT p FROM Payload p JOIN p.facility q WHERE "
	        + "(:shipperId IS NULL OR p.shipperId LIKE %:shipperId%) AND "
	        + "(:truckType IS NULL OR p.truckType LIKE %:truckType%) AND "
	        + "(:productType IS NULL OR p.productType LIKE %:productType%) AND "
	        + "(:loadingPoint IS NULL OR q.loadingPoint LIKE %:loadingPoint%) AND "
	        + "(:unloadingPoint IS NULL OR q.unloadingPoint LIKE %:unloadingPoint%)")
	List<Payload> findAllByParam(@Param("shipperId") String shipperId, @Param("truckType") String truckType,
			@Param("productType") String productType, @Param("loadingPoint") String loadingPoint,
			@Param("unloadingPoint") String unloadingPoint);
}
