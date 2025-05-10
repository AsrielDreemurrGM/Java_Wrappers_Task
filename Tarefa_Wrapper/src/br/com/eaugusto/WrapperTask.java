package br.com.eaugusto;

public class WrapperTask {

	public static void main(String[] args) {
		WrapperTask human = new WrapperTask();
		
		human.setAge(19);
		human.setAgeAsInteger();
		
		human.setCpf(3000000000L);
		human.setCpfAsInt();
		
		System.out.println("Primitive int age: " + human.getAge());
		System.out.println("Wrapper Integer age: " + human.getAgeAsInteger());
		
		System.out.println("Original CPF (long): " + human.getCpf());
		System.out.println("Converted CPF (int): " + human.getCpfAsInt());

	}
	
	private int age;
	private Integer ageAsInteger;
	private long cpf;
	private Integer cpfAsInt;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getAgeAsInteger() {
		return ageAsInteger;
	}

	public void setAgeAsInteger() {
		this.ageAsInteger = age;
	}
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Integer getCpfAsInt() {
		return cpfAsInt;
	}

	public void setCpfAsInt() {
		this.cpfAsInt = (int) cpf;
	}
}
