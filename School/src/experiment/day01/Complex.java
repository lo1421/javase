package experiment.day01;
//复数的运算
public class Complex {
    //实部和虚部的定义
    private double realPart;
    private double imagePart;

    //构造方法
    public Complex() {

    }

    public Complex(double realPart, double imagePart) {
        this.realPart = realPart;
        this.imagePart = imagePart;
    }
    //setter and getter


    public double getImagePart() {
        return imagePart;
    }

    public void setImagePart(double imagePart) {
        this.imagePart = imagePart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    //复数的加法
    public Complex add(Complex complexNumber) {
        if (complexNumber == null) {
            System.out.println("复数对象输入错误，请重新输入！");
            return new Complex();
        }
        double newImagePart = this.getImagePart() + complexNumber.getImagePart();
        double newRealPart = this.getRealPart() + complexNumber.getRealPart();
        return new Complex(newRealPart, newImagePart);
    }

    //复数的减法
    public Complex sub(Complex complexNumber) {
        if (complexNumber == null) {
            System.out.println("复数对象输入错误，请重新输入！");
            return new Complex();
        }
        double newImagePart = this.getImagePart() - complexNumber.getImagePart();
        double newRealPart = this.getRealPart() - complexNumber.getRealPart();
        return new Complex(newRealPart, newImagePart);
    }

    //复数的乘法
    public Complex mul(Complex complexNumber) {
        if (complexNumber == null) {
            System.out.println("输入复数对象错误，请重新输入！");
            return new Complex();
        }
        double newRealPart = this.getRealPart() * complexNumber.getRealPart() - this.getImagePart() * complexNumber.getImagePart();
        double newImagePart = this.getRealPart() * complexNumber.getImagePart() + this.getImagePart() * complexNumber.getRealPart();
        return new Complex(newRealPart, newImagePart);
    }

    public Complex division(Complex complexNumber) {
        if (complexNumber == null) {
            System.out.println("输入复数对象错误，请重新输入！");
            return new Complex();
        }
        double newRealPart = (this.getRealPart() * complexNumber.getRealPart() + this.getImagePart() * complexNumber.getImagePart()) / (complexNumber.getRealPart() * complexNumber.getRealPart() + complexNumber.getImagePart() * complexNumber.getImagePart());
        double newImagePart = (-this.getRealPart() * complexNumber.getImagePart() + this.getImagePart() * complexNumber.getRealPart())/ (complexNumber.getRealPart() * complexNumber.getRealPart() + complexNumber.getImagePart() * complexNumber.getImagePart());
        return new Complex(newRealPart, newImagePart);
    }
    //重写toString方法
    public String toString(){
        if(imagePart>0){
            return realPart+"+"+imagePart+"i";
        }else if(imagePart<0){
            return realPart+imagePart+"i";
        }else return realPart+" ";
    }
}