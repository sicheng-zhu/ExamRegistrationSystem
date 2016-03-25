package com.Input.RegistrationSystem;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Sicheng Zhu
 */
public class ClearAction extends ActionSupport {
    public boolean clearAll() {
        try {
            ActionContext.getContext().getSession().clear();      
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
}
