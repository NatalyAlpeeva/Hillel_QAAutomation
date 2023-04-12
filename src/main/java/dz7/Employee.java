package dz7;

public abstract class Employee {
        public final String name;

   public Employee(String name) {
      this.name = name;
   }


   public String getName() {
      return name;
   }
   public String getLastName() {
      return null;
   }

   public abstract String getPosition();
   public abstract String getSeniority();

   public String getInfo() {
      return getName()+ " is a "+ getSeniority()+ " " + getPosition();
   }

}

