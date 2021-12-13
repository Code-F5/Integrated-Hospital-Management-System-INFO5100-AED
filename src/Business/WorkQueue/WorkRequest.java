/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;


public class WorkRequest {

    private String message;
    private String status;
  
  
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
