package com.nicholasnkk.test.api;

import com.nicholasnkk.test.model.Feature;
import com.nicholasnkk.test.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("feature")
@RestController
public class FeatureController {

    private final FeatureService featureService;

    @Autowired
    public FeatureController(FeatureService featureService) {
        this.featureService = featureService;
    }

    @PostMapping
    public void addFeature(@RequestBody Feature feature) {
        featureService.addFeature(feature);
    }

    @GetMapping
    public boolean getAccessRights(@RequestParam("email") String email,@RequestParam("featureName") String featureName) {
        return featureService.getAccessRights(email, featureName);
    }
}
