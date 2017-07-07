/*
 * Copyright (c) 2017. Michael Qvortrup
 */

package com.qm.planner.model;

/**
 * Created by michael on 6/28/2017.
 */
public class BacklogBuilder {

    private Backlog backlog;

    public BacklogBuilder(String name) {
        this.backlog = new Backlog (name);
    }

    public BacklogBuilder addFeature(String name) {
        this.backlog.appendFeature(new Feature(name));
        return this;
    }

    public Backlog build() {
        return this.backlog;
    }
}
