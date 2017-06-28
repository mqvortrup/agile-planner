/*
 * Copyright (c) 2017. Michael Qvortrup
 */

package com.qm.planner.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michael on 6/28/2017.
 */
public class Backlog {

    private String name;
    private List<Feature> features;

    public Backlog(String name) {
        this.name = name;
        this.features = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appendFeature(Feature feature) {
        this.features.add(feature);
    }

    @Override
    public String toString() {
        return "Backlog{" +
                "name='" + name + '\'' +
                ", features=" + features +
                '}';
    }
}
