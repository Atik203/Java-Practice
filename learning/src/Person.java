interface Salary{

    double calculateSalary();
}

abstract class Person implements Salary {
    private int basicSalary;
    private int workHour;


    public Person(int basicSalary, int workHour) {
        this.basicSalary = basicSalary;
        this.workHour = workHour;
    }

    public Person()
    {
        this.basicSalary = 0;
        this.workHour = 0;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }


}

class Manager extends Person{
    private int experience;

    public Manager(int basicSalary, int workHour, int experience) {
        super(basicSalary, workHour);
        this.experience = experience;
    }

    public Manager()
    {
        super();
        this.experience = 0;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + (experience*5000);
    }
}

class Worker extends Person{


    public Worker(int basicSalary, int workHour) {
        super(basicSalary, workHour);

    }

    public Worker()
    {
        super();
    }


    @Override
    public double calculateSalary() {
        return getWorkHour() * 200;
    }
}

class Officer extends Person{
    private int experience;
    private int overTime;

    public Officer(int basicSalary, int workHour, int experience, int overTime) {
        super(basicSalary, workHour);
        this.experience = experience;
        this.overTime = overTime;
    }

    public Officer()
    {
        super();
        this.experience = 0;
        this.overTime = 0;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + (experience*1000) + (overTime*500);
    }
}

class Test1{
    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Manager(10000, 8, 5);
        persons[1] = new Worker();
        persons[1].setWorkHour(8);
        persons[2] = new Officer();
        persons[2].setBasicSalary(2500);


        double total = 0;
        for (Person person : persons) {
            total += person.calculateSalary();
        }

        double avg = total/persons.length;

        System.out.println("Average Salary: " + avg);

    }
}