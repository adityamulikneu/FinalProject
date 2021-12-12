/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Appointment;

import Business.Enterprise.Enterprise;
import Business.Patient.Employee;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author divye
 */
public class AppointmentDirectory {
    
    private ArrayList<PatientAppointment> appointmentAccountList;
    
    public AppointmentDirectory() {
        appointmentAccountList = new ArrayList();
    }

    public ArrayList<PatientAppointment> getAppointmentAccountList() {
        return appointmentAccountList;
    }
    
    public PatientAppointment createAppointment(UserAccount sender, UserAccount receiver, String status,String issue, Date requestDate, boolean regularAppointment, String message){

        PatientAppointment appointment = new PatientAppointment();
        appointment.setSender(sender);
        appointment.setReceiver(receiver);
        appointment.setStatus(status);
        appointment.setIssue(issue);
        appointment.setRequestDate(requestDate);
        appointment.setType(regularAppointment);
        appointment.setMessage(message);
        appointmentAccountList.add(appointment);
//        System.out.println("Checkign if data is populated");
        return appointment;
    }
}
