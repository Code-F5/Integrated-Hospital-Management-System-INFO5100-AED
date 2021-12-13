/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;


public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
        public WorkRequest addWorkRequest(){
         WorkRequest w = new WorkRequest();
        workRequestList.add(w);
        return w;
    }
     public WorkRequest addWorkRequest(WorkRequest w){
        workRequestList.add(w);
        return w;
    }
    public void removeWorkRequest(WorkRequest w) {
        workRequestList.remove(w);
    }
    
}