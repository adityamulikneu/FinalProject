/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author adityamulik
 */

enum AppointmentType {
    Regular,
    Emergency
}

public class EmergencyWorkQueue extends WorkRequest {
       
    private String issue;
    private AppointmentType type;

    public EmergencyWorkQueue() {
        // fetch nurse from UserAccountDirectory, look for Role enum in UserAccount
    } 
    
    public AppointmentType getType() {
        return type;
    }

    public void setType(boolean regularAppointment) {
        if(regularAppointment){
            this.type = AppointmentType.Regular;
        }
        else
            this.type = AppointmentType.Emergency;
    }
    
    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }               

    @Override
    public String toString() {
        return String.format("Sender: %s, Receiver: %s", getSender(), getReceiver()); //To change body of generated methods, choose Tools | Templates.
    }
}
