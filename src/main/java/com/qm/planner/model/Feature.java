/*
 * Copyright (c) 2017. Michael Qvortrup
 */

package com.qm.planner.model;

import java.util.UUID;

/**
 * Created by michael on 6/28/2017.
 */
public class Feature {

    private final UUID id = UUID.randomUUID();

    private String name;

    public Feature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
