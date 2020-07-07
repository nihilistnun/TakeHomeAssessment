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
        //check if feature and email combo already exists
        for (Feature f : DB) {
            if (f.getEmail().equals(feature.getEmail()) && f.getFeatureName().equals(feature.getFeatureName())) {
                //remove old value
                DB.remove(f);
                //add new value
                DB.add(feature);
                return 1;
            }
        }
        //add new entry
        DB.add(feature);
        return 1;
    }

    @Override
    public boolean getAccessRights(String email, String featureName) {
        for (Feature f : DB)
            if (f.getEmail().equals(email) && f.getFeatureName().equals(featureName))
                return f.isEnable();
        return false;//false on default
    }
}
