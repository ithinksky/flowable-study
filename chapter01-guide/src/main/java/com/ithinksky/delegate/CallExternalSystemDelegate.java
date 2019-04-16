package com.ithinksky.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * 功能描述：
 *
 * @author tengpeng.gao
 * @since 2019/4/17
 */
public class CallExternalSystemDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Calling the external system for employee "
                + execution.getVariable("employee"));
    }

}