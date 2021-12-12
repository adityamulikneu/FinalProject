/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Appointment;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author divye
 */
enum AppointmentType {
    Regular,
    Emergency
}

public class PatientAppointment extends WorkRequest{
    private String issue;
    private AppointmentType type;

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
    
    public PatientAppointment() {
        // fetch nurse from UserAccountDirectory, look for Role enum in UserAccount
    }        

    @Override
    public String toString() {
        return String.format("Sender: %s, Receiver: %s", getSender(), getReceiver()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
