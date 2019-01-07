package com.dhcs.business.workqueue;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shivesh
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    Map<String, Boolean> booleanMap = new HashMap<String, Boolean>();

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Map<String, Boolean> getBooleanMap() {
        return booleanMap;
    }

    public void setBooleanMap(Map<String, Boolean> booleanMap) {
        this.booleanMap = booleanMap;
    }
    
    
}
