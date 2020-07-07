package com.nicholasnkk.test.api;

import com.nicholasnkk.test.model.Feature;
import com.nicholasnkk.test.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

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

    @RequestMapping
    @ResponseBody
    public Map<String, Boolean> getAccessRights(@RequestParam("email") String email, @RequestParam("featureName") String featureName) {
        return Collections.singletonMap("canAccess", featureService.getAccessRights(email, featureName));
    }
}
