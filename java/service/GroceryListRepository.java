
package com.revature.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.GroceryList;

@Repository
public interface GroceryListRepository extends CrudRepository<GroceryList, Integer> {

