/*
 * Copyright (c) 2017. Michael Qvortrup
 */

package com.qm.planner;

import com.google.gson.Gson;
import com.qm.planner.model.Backlog;
import com.qm.planner.model.BacklogBuilder;

/**
 * Created by michael on 6/28/2017.
 */
public class Main {

    public static void main(String[] args) {

        Backlog backlog =(new BacklogBuilder("my backlog"))
                .addFeature("a feature")
                .addFeature("another feature")
                .build();

        System.out.println(backlog);

        Gson g = new Gson();

        System.out.println(g.toJson(backlog));

        Backlog deserBacklog = g.fromJson(g.toJson(backlog), Backlog.class);

        System.out.println(deserBacklog);

        deserBacklog.changeFirstFeatureName("Hold the horses!");

        System.out.println(deserBacklog);

    }
}
