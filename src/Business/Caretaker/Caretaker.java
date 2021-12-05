 /* and open the template in the editor.
 */
package Business.Caretaker;

import Business.WorkQueue.WorkQueue;


public class Caretaker {
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
