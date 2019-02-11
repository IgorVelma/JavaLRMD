import lib.*;
import Clinic.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Run {

    private Clinic clinic;
    private ClinicOperations clinicOperations;

    public Run(){
       this.clinic = new Clinic(10);
        clinic.addClient(new Client("Marry", new Dog("Pop")));
    }

    public void workingClinic(){
        while (true) {
            this.clinicOperations = ConsoleWorker.askOperation();
            clinic.clinicWork(this.clinicOperations);
        }
    }


    public static void main(String[] args) {
        Run run = new Run();
        run.workingClinic();
    }
}
