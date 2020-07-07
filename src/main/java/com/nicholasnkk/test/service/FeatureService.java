package com.nicholasnkk.test.service;

import com.nicholasnkk.test.dao.FeatureDAO;
import com.nicholasnkk.test.model.Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureService {

    private final FeatureDAO featureDAO;

    @Autowired
    public FeatureService(@Qualifier("mockDAO") FeatureDAO featureDAO) {
        this.featureDAO = featureDAO;
    }

    public int addFeature(Feature feature) {
        return featureDAO.insertFeature(feature);
    }

    public List<Feature> getAllFeatures() {
        return featureDAO.selectAllPeople();
    }
}
