package eBebek;

public  class Employee {

	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	
	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	public Employee() {
		
	}

	public double tax() {
		if (this.salary >= 1000) {
			double vergi = (this.salary * 3) / 100;
			return vergi;
		} else {
			System.out.println("Maaþýnýza vergi uygulanmayacaktýr.");
		}

		return 0;
	}

	public double bonus() {
		if (this.workHours > 40) {
			double bonus = (this.workHours - 40) * 30;
			return bonus;
		}
		return 0;
	}
	
	public double raiseSalary() {
		int currentYear=2021;
		int totalWorkedYear=(currentYear-this.hireYear);
		double raise=0.0;
		
		if(totalWorkedYear<10) {
			 raise=(this.salary*5)/100;
		}
		else if(totalWorkedYear>9 && totalWorkedYear<20) {
			raise=(this.salary*10)/100;
		}
		else if(totalWorkedYear>19) {
			raise=(this.salary*15)/100;
		}
		return raise;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public double newSalary() {
		return taxedAndBonusSalary()+raiseSalary();
	}

	public double taxedAndBonusSalary() {
		return salary+bonus()-tax();
	}

	public String toString() {
		return   " Isim Soyisim                       :"+this.getName()
				+"\n Maas                             :"+this.getSalary()
				+"\n Calisma Saati                    :"+this.getWorkHours()
				+"\n Baslangic Yili                   :"+this.getHireYear()
				+"\n Vergi                            :"+this.tax()
				+"\n Bonus                            :"+this.bonus()
				+"\n Maas Artisi                      :"+this.raiseSalary()
				+"\n Vergi ve Bonuslarla              :"+this.newSalary();
		
	}
}