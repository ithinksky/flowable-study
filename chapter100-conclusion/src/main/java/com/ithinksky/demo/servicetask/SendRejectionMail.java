package com.ithinksky.demo.servicetask;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * 功能描述：发送审核拒绝邮件
 *
 * @author tengpeng.gao
 * @since 2019/4/11
 */
public class SendRejectionMail implements JavaDelegate {

    public void execute(DelegateExecution execution) {
        System.out.println("Send out rejection email to " + execution.getVariable("employee"));
    }

}
