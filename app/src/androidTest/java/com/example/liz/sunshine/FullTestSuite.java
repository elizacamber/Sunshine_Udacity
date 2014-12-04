package com.example.liz.sunshine;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by eliza on 22/11/2014.
 */
public class FullTestSuite extends TestSuite {
        public static Test suite() {
            return new TestSuiteBuilder(FullTestSuite.class)
                    .includeAllPackagesUnderHere().build();
        }

        public FullTestSuite() {
            super();
        }
    }
