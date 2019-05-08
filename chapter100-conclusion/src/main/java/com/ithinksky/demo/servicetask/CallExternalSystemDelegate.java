package com.ithinksky.demo.servicetask;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * 功能描述：审核通过调用三方系统。
 *
 * @author tengpeng.gao
 * @since 2019/4/11
 */
public class CallExternalSystemDelegate implements JavaDelegate {

    public void execute(DelegateExecution execution) {
        System.out.println("Calling the external system for employee " + execution.getVariable("employee"));
    }

}
