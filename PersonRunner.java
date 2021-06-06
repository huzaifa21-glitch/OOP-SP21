public class PersonRunner {
    public static void main(String[] args) {
 Student[] std = new Student[4];
     std[0] = new Student("Rahid","321");
        std[1] = new Student("Lalit","789");
        std[2] = new Student("Shazir","4532");
        std[0].associate();
        std[1].associate();
        std[2].associate();

       Teacher[] teacher = new Teacher[5];
       teacher[0] = new Teacher("Malik","101");
        teacher[1] = new Teacher("Ahsan","187");
        teacher[2] = new Teacher("Habib","092");
        teacher[0].associate();
        teacher[1].associate();
        teacher[2].associate();

        HumanResource human = new HumanResource();
        human.Add(std[0]);
        human.Add(std[1]);
        human.Add(std[2]);
        human.Add(teacher[0]);
        human.Add(teacher[1]);
        human.Add(teacher[2]);
        System.out.println(human.toString());
        System.out.println(" ");
        human.delete(1);
        human.delete(2);

        System.out.println("After deletion");
        System.out.println(human.toString());

        /**
         * HumanResource hr = new HumanResource(); hr.addEntity(student[0]);
         * hr.addEntity(student[1]); hr.addEntity(student[2]);
         * hr.addEntity(teacher[0]); hr.addEntity(teacher[1]);
         * hr.addEntity(teacher[2]); hr.print(); System.out.println("Before
         * deletion"); System.out.println("\n");
         *
         * hr.delete("201"); hr.delete("121");
         *
         * System.out.println("After deletion"); hr.print();
         *
         */

        /**
         * ABOVE IS TEST RUNNER ONLY.
         * REAL IMPLEMENTATION IS BELOW.
         */



        /**
         * The runner below is of array. Array implementation runner.
         */
        /**
         * HumanResource hr = new HumanResource(); hr.adden(student[0]);
         * hr.adden(student[1]); hr.adden(student[2]);
         *
         * hr.adden(teacher[0]); hr.adden(teacher[1]); hr.adden(teacher[2]);
         * System.out.println(hr.toString()); System.out.println("Before
         * deletion"); System.out.println("\n"); hr.delete(0); hr.delete(1);
         *
         * System.out.println("After deletion");
         * System.out.println(hr.toString());
         *
         */



    }
}
