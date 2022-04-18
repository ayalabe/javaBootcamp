package bootcamp.oop.exercise;

public class ComplexNum implements Complexable{

	//fildes:
	private int realNum;
	private int imagNum;
	
	//Constructor:
	public ComplexNum() {
		setRealNum(0);
		setImagNum(0);
		
	}
	
	public ComplexNum(int realNum, int imagNum) {
		setRealNum(realNum);
		setImagNum(imagNum);
		
	}

	//Getters and Setters
	public int getRealNum() {
		return realNum;
	}

	public void setRealNum(int realNum) {
		this.realNum = realNum;
	}

	public int getImagNum() {
		return imagNum;
	}

	public void setImagNum(int imagNum) {
		this.imagNum = imagNum;
	}
	
	//Methods:
	protected ComplexNum copy() {
		ComplexNum num = new ComplexNum(this.realNum,this.imagNum);
		return num;
	}
	
	public void add(ComplexNum z) {
		this.realNum += z.realNum;
		this.imagNum += z.imagNum;
	}
	
	public void subtract(ComplexNum z) {
		this.realNum -= z.realNum;
		this.imagNum -= z.imagNum;
	}
	
	public void multiply(ComplexNum z) {
		setRealNum(this.realNum * z.realNum - this.imagNum * z.imagNum);
		setImagNum(this.realNum * z.realNum + this.imagNum * z.imagNum);
	}
	
	public void divide(ComplexNum z) {
		int c = z.realNum;
		int d = z.imagNum;
		
		// check for Re,Im(z) == 0 to avoid +/-infinity in result
		int zreal2 = 0;
		if (c != 0)
		{
			zreal2 = (int) StrictMath.pow(c, 2);
		}
		int zimag2 = 0;
		if (d != 0)
		{
			zimag2 = (int) StrictMath.pow(d, 2);
		}
		
		int ac = this.realNum*c;
		int bd = this.imagNum*d;
		int bc = this.imagNum*c;
		int ad = this.realNum*d;
		
		this.realNum = (ac+bd)/(zreal2+zimag2);
		this.imagNum = (bc-ad)/(zreal2+zimag2);
	}
	
	
	
	public ComplexNum add(ComplexNum z1, ComplexNum z2) {
		ComplexNum z1Copy = z1.copy();
		z1Copy.add(z2);
		return z1Copy;
	}
 
	public ComplexNum subtract(ComplexNum z1, ComplexNum z2) {
		ComplexNum z1Copy = z1.copy();
		z1Copy.subtract(z2);
		return z1Copy;
	}
	
	public ComplexNum multiply(ComplexNum z1, ComplexNum z2) {
		ComplexNum z1Copy = z1.copy();
		z1Copy.multiply(z2);
		return z1Copy;
	}
	
	public ComplexNum divide(ComplexNum z1, ComplexNum z2) {
		ComplexNum z1Copy = z1.copy();
		z1Copy.divide(z2);
		return z1Copy;
	}
	
	public ComplexNum conjugate() {
		return new ComplexNum(getRealNum(), -getImagNum());
	}
	
	public ComplexNum square() {
		double r = Math.sqrt(this.mod());
        double theta = this.arg()/2;
        return new Complex(r*Math.cos(theta),r*Math.sin(theta));
		return new ComplexNum(this.realNum * this.realNum, this.imagNum * this.imagNum);
	}
		
	public double mag() {
		ComplexNum newSquare = this.square();
		return Math.sqrt(newSquare.realNum + newSquare.imagNum);
	}
	
	public String toString() {
		return String.valueOf(this.realNum) + " " + String.valueOf(this.imagNum) + "i";
	}
	
	public ComplexNum pow(ComplexNum z, int power) {
		return new ComplexNum(Math.exp(x)*Math.cos(y),Math.exp(x)*Math.sin(y))
	}
}
