
public class test_override {
      public static void main(String[] args) {
            EmployeManager manager = new EmployeManager();
            manager.addEmployee("yusuf", "yalcin", "mudur", 5000);
            System.out.println(manager.getEmployeeİnfo());
            EngineerManager eng = new EngineerManager();
            eng.addEmployee("hakan", "yolac", "sistemmuh", 90000);
            System.out.println(eng.getEmployeeİnfo());
            eng.makeRise(5600);
            EngineerManager.deneme();
            EmployeManager.deneme();

      }
}

class EmployeManager {
      String employeeName, employeeSurNsme, employeeJob;
      double employeeMoney;

      public void addEmployee(String employeeName, String employeeSurNsme, String employeeJob, double employeeMoney) {
            this.employeeName = employeeName;
            this.employeeSurNsme = employeeSurNsme;
            this.employeeJob = employeeJob;
            this.employeeMoney = employeeMoney;

      }

      public String getEmployeeİnfo() {
            if (employeeName != null && employeeSurNsme != null && employeeJob != null) {
                  if (employeeMoney <= 0)
                        employeeMoney = 0;
                  return "calisanin ismi" + employeeName + "\n" + "soyisim" + employeeSurNsme + "\n" + "meslegi"
                              + employeeJob + "maas" + "\n" + employeeMoney;

            }
            return "calisan mevcut degil";
      }

      public void makeRise(double artis) {
            this.employeeMoney += artis;
            System.out.println("calisaın zamli maasi" + this.employeeMoney);
      }

      public static void deneme() {
            System.out.println("ana class ın static metodu calisti");
      }

}

class EngineerManager extends EmployeManager {
      @Override
      public void makeRise(double artis) {
            super.employeeMoney += artis;
            super.employeeMoney += 1000;
            System.out.println(
                        this.employeeName + " calisanina" + artis + "kadar zam yapildi " + 1000 + "tl artis yapildi");
      }

      public static void deneme() {
            System.out.println("sub classinin static metodu calisti");
      }
}