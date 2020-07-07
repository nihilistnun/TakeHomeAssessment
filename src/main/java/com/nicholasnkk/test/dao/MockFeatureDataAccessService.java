package com.nicholasnkk.test.dao;

import com.nicholasnkk.test.model.Feature;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("mockDAO")
public class MockFeatureDataAccessService implements FeatureDAO {

    private static List<Feature> DB = new ArrayList<>();

    @Override
    public int insertFeature(Feature feature) {
        DB.add(feature);
        return 1;
    }

    @Override
    public List<Feature> selectAllPeople() {
        return DB;
    }
}
