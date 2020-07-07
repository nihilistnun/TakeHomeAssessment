package com.nicholasnkk.test.dao;

import com.nicholasnkk.test.model.Feature;

import java.util.List;

public interface FeatureDAO {

    int insertFeature(Feature feature);

    List<Feature> selectAllPeople();
}
