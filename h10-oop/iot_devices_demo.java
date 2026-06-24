
public class iot_devices_demo {
      public static void main(String[] args) {
            IotDevice thermostat = new SmartThermostat("TH-123", "koridor", 18.0, 25);
            IotDevice camera = new SmartSecurityCamera("SC-005", "oturma odasi");
            thermostat.connectToNetwork();
            camera.connectToNetwork();
            thermostat.performFunction();
            camera.performFunction();
            System.out.println(thermostat.getStatus());
            System.out.println(camera.getStatus());

      }
}

abstract class IotDevice {
      protected String deviceId;
      protected String location;

      public IotDevice(String deviceId, String location) {
            this.deviceId = deviceId;
            this.location = location;
      }

      public void connectToNetwork() {
            System.out.println("baglantı kurulan cihaz:" + deviceId + "konumu " + location);
      }

      public abstract void performFunction();

      public abstract String getStatus();
}

class SmartThermostat extends IotDevice {
      private double currentTemperature;
      private double targetTemperature;
      private String status;

      public SmartThermostat(String deviceId, String location, double currentTemperature, double targetTemperature) {
            super(deviceId, location);
            this.targetTemperature = targetTemperature;
            this.currentTemperature = 22;
            this.status = "ıdle";
      }

      @Override
      public void performFunction() {
            System.out.println("sicakligi su hedef degere ayarliyor" + targetTemperature);
            this.currentTemperature = currentTemperature;
            this.status = "Adjusted";
            System.out.println("sicakligin degeri ayalandi");
      }

      @Override
      public String getStatus() {
            return "su anki sicaklik" + currentTemperature + "statu" + status;

      }
}

class SmartSecurityCamera extends IotDevice {
      private boolean isRecording;
      private String status;

      public SmartSecurityCamera(String id, String location) {
            super(id, location);
            this.isRecording = false;
            this.status = "Idle";
      }

      @Override
      public void performFunction() {
            System.out.println("video kaydi baslatiliyor...");
            isRecording = true;
            status = "Recording";
            System.out.println("video kaydi suruyor");
      }

      @Override
      public String getStatus() {
            return "kayit ediyor mu" + (isRecording ? "active" : "inactive") + "Ststus" + status;
      }
}