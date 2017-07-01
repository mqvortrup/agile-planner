/*
 * Copyright (c) 2017. Michael Qvortrup
 */

package com.qm.planner.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by michael on 6/28/2017.
 */
public class Backlog {

    private String name;
    private List<Feature> prioritizedFeatures;
    private Set<Feature> allFeatures;

    public Backlog(String name) {
        this.name = name;
        this.prioritizedFeatures = new ArrayList<>();
        this.allFeatures = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appendFeature(Feature feature) {
        this.prioritizedFeatures.add(feature);
        this.allFeatures.add(feature);
    }


    public void changeFirstFeatureName(String name) {
        prioritizedFeatures.get(0).setName(name);
    }

    @Override
    public String toString() {
        return "Backlog{" +
                "name='" + name + '\'' +
                ", prioritizedFeatures=" + prioritizedFeatures +
                ", allFeatures=" + allFeatures +
                '}';
    }
}
