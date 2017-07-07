/*
 * Copyright (c) 2017. Michael Qvortrup
 */

package com.qm.planner.server.spark;

/**
 * Created by michael on 07.07.17.
 */
import static spark.Spark.*;

public class SparkApplication {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }

}
