/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author deepshah
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequests;

    public WorkQueue() {
        workRequests = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequests() {
        return workRequests;
    }
    
}
