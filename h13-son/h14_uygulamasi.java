import java.io.ObjectInputFilter.Status;
import java.util.AbstractList;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class h14_uygulamasi {
      public static void main(String[] args) {

      }
}

interface Manageable {
      void monitor();

      void optimize();
}

interface Interactable {
      void interact(User user);
}

enum SystemStatus {
      ACTIVE,
      MAINTENANCE,
      INACTIVE
}

abstract class CitySystem implements Manageable, Interactable {
      protected String name;
      protected String dateCreated;
      protected SystemStatus status;

      public CitySystem(String name, String dateCreated, SystemStatus status) {
            this.name = name;
            this.dateCreated = dateCreated;
            this.status = status;
      }

      public SystemStatus getStatus() {
            return status;
      }

      public void setStatus(SystemStatus status) {
            this.status = status;
      }

      public String getName() {
            return name;
      }

      public abstract void simulate();

}

class VehicleManagment extends CitySystem {
      private int vehicleCount;

      public VehicleManagment(int vehicleCount, String name, String dateCreated, SystemStatus status) {
            super(name, dateCreated, status);
            this.vehicleCount = vehicleCount;
      }

      public void addVehicle() {
            vehicleCount++;
      }

      public void removeVehicle() {
            vehicleCount--;
      }

      @Override
      public void simulate() {
            System.out.println("simule ediliyor");
      }

      @Override
      public void monitor() {
            System.out.println("monitor");
      }

      @Override
      public void optimize() {
            System.out.println("optimize");
      }

      @Override
      public void interact(User user) {
            System.out.println(user.getName() + " is interacting with Vehicle Management System.");
      }

}

class EnergyManagment extends CitySystem {
      double energyConsumption;

      public EnergyManagment(String name, String dateCreated, Status status, double energyConsumption) {
            super(name, dateCreated, status);
            this.energyConsumption = energyConsumption;
      }

      void reduceEnergyConsumption(double amount) {
            System.out.println("reduce energy consumption");
      }

      @Override
      public void simulate() {
            System.out.println("enerjiyi simule ediliyor");
      }

      @Override
      public void monitor() {
            System.out.println("enerji monitor");
      }

      @Override
      public void optimize() {
            System.out.println("energy optimization");
      }

}

class WasteManagment extends CitySystem {
      int wasteLevel;

      public WasteManagment(int wasteLevel, String name, String dateCString, SystemStatus status) {
            super(name, dateCreated, status);

      }

      public void wasteLevel(int wasteLevel) {
      }

      public void collectWasteLevel(int collectWasteLevel) {
      }

      @Override
      public void simulate() {
            System.out.println("waste simulation");
      }

      @Override
      public void monitor() {
            System.out.println("waste monitor");
      }

      @Override
      public void optimize() {
            System.out.println("waste optimization");
      }

}
