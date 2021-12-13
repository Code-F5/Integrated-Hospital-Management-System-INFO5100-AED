 /* and open the template in the editor.
 */
package Business.Donor;

import Business.WorkQueue.WorkQueue;


public class Donor {
    private String name;
    WorkQueue workQueue;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
}
